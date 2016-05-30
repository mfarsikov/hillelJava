package patterns.factory;

import enums.PizzaType;
import patterns.factory.factory.*;

/**
 * Created by MBCNEWMAIN on 30.05.2016.
 */
public class PizzaMain {
    public static void main(String[] args) {

        String stringPizzaType = "meat";
        PizzaType truePizzaType = PizzaType.of(stringPizzaType);

        System.out.println(truePizzaType.getName());


        PizzaComponentsFactory nyComponentFactory = new NyPizzaComponentFactory();
        PizzaStore nyPizzaStore = new PizzaStore(new NyPizzaFactory(nyComponentFactory));
        nyPizzaStore.order(PizzaType.CHEESE);

        PizzaComponentsFactory chComponentFactory = new ChPizzaComponentFactory();
        PizzaStore chPizzaStore = new PizzaStore(new ChPizzaFactory(chComponentFactory));
        chPizzaStore.order(PizzaType.MEAT);
    }
}
