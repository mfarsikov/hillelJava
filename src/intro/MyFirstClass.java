package intro;

/**
 * Created by User on 09.02.2016.
 */
public class MyFirstClass {
    public static void main(String args[]) {
        String message = "Hello world!";
        int birthYear = 1984;
        int age = 2016 - birthYear;

        message = "Hello, " + "world! I'm " + age;

        System.out.println(message);

        long years = 2016L;
        long days = 365;
        long hours = 24;
        long seconds = 3600;
        long millis = 1000;

        long millisecondsFromBC = 2016 * 365 * 24 * 3600 * 1000;

        millisecondsFromBC = years * days * hours * seconds * millis;

        millisecondsFromBC = 2016 * 365 * 3600 * 1000 * hours;

        millisecondsFromBC = 2016L * 365L * 24L * 3600L * 1000L;

        int intYears = (int) years;

        millisecondsFromBC = (long) (2016 * 365) * 24 * 3600 * 1000;

        System.out.println(millisecondsFromBC);

    }
}
