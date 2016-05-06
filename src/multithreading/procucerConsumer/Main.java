package multithreading.procucerConsumer;

/**
 * Created by MBCNEWMAIN on 06.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Bucket bucket = new Bucket(123);
        Thread consumerThread = new Thread(new Consumer(bucket));
        Thread producerThread = new Thread(new Producer(bucket));

        consumerThread.start();
        producerThread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {
        }

        consumerThread.interrupt();
        producerThread.interrupt();

        try {
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            producerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("all threads are stopped");
        System.out.println(bucket);
    }
}
