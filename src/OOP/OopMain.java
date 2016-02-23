package OOP;

import intro.StringExample;
import intro.Utils;

/**
 * Created by User on 23.02.2016.
 */
public class OopMain {
    public static void main(String[] args) {

        passPrimitives();

        passObjects();

        passImmutableObjects();

        equalsExample();

        Human i = new Human();

        System.out.println("hands: " + Human.handsAmount);

        Human.handsAmount = 1;

        System.out.println("hands: " + Human.handsAmount);

        i.handsAmount = 2;

        System.out.println(Human.handsAmount);

        i.name = "Max";

        System.out.println("My name is " + i.name);

        Human you = new Human();

        you.name = "Max II";

        System.out.println("we are == " + (i == you));
        System.out.println("we are equals " + i.equals(you));

        System.out.println("names are == " + (i.name == you.name));
        System.out.println("names are equals " + i.name.equals(you.name));

        System.out.println(Human.sayHello());

        System.out.println(i.introduce());
        System.out.println(you.introduce());


    }

    private static void equalsExample() {
        Integer a = 333;
        Integer b = 333;

        System.out.println("== " + (a == b));

        boolean aEqualsB = a.equals(b);
        System.out.println("equals " + aEqualsB);
    }

    private static void passImmutableObjects() {
        Integer i = 10;

        modifyInteger(i);
        System.out.println(i);
    }

    private static void modifyInteger(Integer i) {
        i = null;
    }


    private static void passObjects() {
        int[] ints = new int[3];

        Utils.printArray(ints);
        modifyArray(ints);
        Utils.printArray(ints);
    }

    private static void passPrimitives() {
        int a = 10;

        print(a);

        System.out.println("after: " + a);
    }

    public static void print(int a) {

        System.out.println(a);

        a = 3;
    }

    public static void modifyArray(int[] array) {
        array[0] = 10;
        array[1] = 20;
    }
}
