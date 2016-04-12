package patterns.decorator;

/**
 * Created by MBCNEWMAIN on 12.04.2016.
 */
public class Houseblend implements Beverage {
    @Override
    public int cost() {
        return 10;
    }

    @Override
    public String description() {
        return "Houseblend coffe ";
    }
}
