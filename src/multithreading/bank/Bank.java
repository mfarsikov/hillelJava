package multithreading.bank;

/**
 * Created by MBCNEWMAIN on 29.04.2016.
 */
public class Bank {
    private long account1 = 10_000_000;
    private long account2 = 10_000_000;

    public synchronized void transfer(boolean direction, int amount) {
        if (direction) {
            account1 -= amount;
            account2 += amount;
        } else {
            account2 -= amount;
            account1 += amount;
        }
    }

    public synchronized void check() {
        String message = "";

        if (account1 + account2 != 20_000_000) {
            message = "Something wrong happened!";
        }
        message += " Account1: " + account1;
        message += " Account2: " + account2;

        System.out.println(message);
    }

    public void sayHallo(){
        System.out.println("hallo!");
    }
}
