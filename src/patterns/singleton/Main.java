package patterns.singleton;

/**
 * Created by MBCNEWMAIN on 03.06.2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        TheGod god1;
        TheGod god2;
        int i = 0;
        do {
            GodExtractor extractor1 = new GodExtractor();
            GodExtractor extractor2 = new GodExtractor();
            Thread thread1 = new Thread(extractor1);
            Thread thread2 = new Thread(extractor2);
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();
            god1 = extractor1.god;
            god2 = extractor2.god;
            i++;
            TheGod.clear();
        } while (god1 == god2);

        System.out.println("Heretic! attempts: " + i);

    }

    private static void lazyExample() throws InterruptedException {
        System.out.println("many time...");
        TheGod.prophet();

        Thread.sleep(3000);

        if (Math.random() < 0.5) {
            return;
        }
        System.out.println("using instances");
        God theGod1 = TheGod.getInstance();
        God theGod2 = TheGod.getInstance();
        God theGod3 = TheGod.getInstance();
    }

    private static void commonReligiousQuestions() {
        God theGod = TheGod.getInstance();
        God krishna = new Krishna();

        Beliver.god = theGod;

        Beliver ivan = new Beliver();
        ivan.name = "Ivan";

        Beliver petro = new Beliver();
        petro.name = "Petro";

        System.out.println(ivan);
        System.out.println(petro);

        Beliver.god = krishna;

        System.out.println(ivan);
        System.out.println(petro);
    }
}
