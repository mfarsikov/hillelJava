package multithreading.bank;

/**
 * Created by MBCNEWMAIN on 29.04.2016.
 */
public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Bankier bankier1 = new Bankier(bank);
        Thread bankier1Thread = new Thread(bankier1);

        Bankier bankier2 = new Bankier(bank);
        Thread bankier2Thread = new Thread(bankier2);

        bankier1Thread.start();
        bankier2Thread.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException ignored) {}

        bankier1Thread.interrupt();
        bankier2Thread.interrupt();

        try {
            bankier1Thread.join();
            bankier2Thread.join();
        } catch (InterruptedException ignored) {}

        bank.check();
    }
}
