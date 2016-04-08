package exceptions;

import java.util.Random;

/**
 * Created by MBCNEWMAIN on 08.04.2016.
 */
public class ExceptionsMain {
    public static void main(String[] args) throws InterruptedException {
        try {
            dangerStaff();
        } catch (MyOwnOutOfIndexException | ArithmeticException e) {
            System.out.println(e);
        } catch (RuntimeException e) {
            System.out.println(e + "bla-bla");
        }

        System.out.println("end of program");
    }

    public static void dangerStaff() {
        if (new Random().nextDouble() > 0.5) {
            doWorkWithList();
        } else {
            doDevide(1, 0);
        }
    }

    private static void doWorkWithList() {
        throw new MyOwnOutOfIndexException("bla-bla");
    }

    private static void uncheckedExample() {
        devide(2, 5);
        devide(2, 4);

        System.out.println("before try");
        try {
            System.out.println("before devide");
            devide(1, 0);

            System.out.println("after devide");
        } catch (ArithmeticException caughtException) {
            System.out.println("in catch block");
            System.out.println(caughtException);
        } finally {
            System.out.println("Hello from finally block! :)");
        }
        System.out.println("after try");

        devide(3, 5);

        operation(2, 8, "/");

        operation(4, 1, "/");
    }

    private static void checkedExample() throws InterruptedException {
        try {
            Thread.sleep(1333);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread.sleep(1333);
    }

    private static void devide(int a, int b) {
        doDevide(a, b);
    }

    private static void operation(int a, int b, String operation) {
        switch (operation) {
            case "/":
                doDevide(a, b);
                break;
            case "+":
                System.out.println(a + b);
        }
    }

    private static void doDevide(int a, int b) {
        int i = a / b;
    }
}
