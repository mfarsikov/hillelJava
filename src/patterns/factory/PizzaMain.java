package patterns.factory;

import patterns.factory.factory.ChPizzaFactory;
import patterns.factory.factory.NyPizzaFactory;

/**
 * Created by MBCNEWMAIN on 30.05.2016.
 */
public class PizzaMain {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new PizzaStore(new NyPizzaFactory());
        nyPizzaStore.order("Cheese");

        PizzaStore chPizzaStore = new PizzaStore(new ChPizzaFactory());
        chPizzaStore.order("Cheese");
    }
}
