package patterns.factory.factory;

import patterns.factory.pizza.ChicagoCheesePizza;
import patterns.factory.pizza.ChicagoMeatPizza;
import patterns.factory.pizza.Pizza;

/**
 * Created by MBCNEWMAIN on 30.05.2016.
 */
public class ChPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "Cheese": return new ChicagoCheesePizza();
            case "Meat": return new ChicagoMeatPizza();
            default:
                throw new RuntimeException("Unexpexted pizza type. " +
                        "Expected 'Meat', 'Cheese', but found:" + type);
        }
    }
}
