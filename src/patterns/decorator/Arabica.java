package patterns.decorator;

/**
 * Created by MBCNEWMAIN on 12.04.2016.
 */
public class Arabica implements Beverage {
    @Override
    public int cost() {
        return 15;
    }

    @Override
    public String description() {
        return "Beautiful arabica! ";
    }
}
