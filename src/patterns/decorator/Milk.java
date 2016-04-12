package patterns.decorator;

/**
 * Created by MBCNEWMAIN on 12.04.2016.
 */
public class Milk extends BeverageDecorator {

    public Milk(Beverage beverage){
        super(beverage);
    }

    @Override
    public int cost() {
        return 10 + super.cost();
    }

    @Override
    public String description() {
        return super.description() + ", milk";
    }
}
