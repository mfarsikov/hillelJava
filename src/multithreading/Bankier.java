package multithreading;

import java.util.Random;

/**
 * Created by MBCNEWMAIN on 29.04.2016.
 */
public class Bankier implements Runnable {
    private Bank bank;
    private Random random = new Random();

    public Bankier(Bank bank) {
        this.bank = bank;
    }

    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            int amount = random.nextInt(1000) + 1;
            boolean direction = random.nextBoolean();
            bank.transfer(direction, amount);
        }
    }
}
