package patterns.decorator;

/**
 * Created by MBCNEWMAIN on 12.04.2016.
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Beverage arabica = new Arabica();
        Beverage robusta = new Robusta();

        arabica = new Milk(arabica);
        arabica = new Milk(arabica);

        robusta = new Milk(new Cream(robusta));

        printBeverage(arabica);

        printBeverage(robusta);
    }

    public static void printBeverage(Beverage beverage) {
        System.out.println("price is: " + beverage.cost() + ", " + beverage.description());
    }
}
