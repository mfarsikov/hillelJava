package patterns.factory.factory;

import patterns.factory.pizza.NewYorkCheesePizza;
import patterns.factory.pizza.NewYorkMeatPizza;
import patterns.factory.pizza.Pizza;

/**
 * Created by MBCNEWMAIN on 30.05.2016.
 */
public class NyPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "Cheese": return new NewYorkCheesePizza();
            case "Meat": return new NewYorkMeatPizza();
            default:
                throw new RuntimeException("Unexpexted pizza type. " +
                        "Expected 'Meat', 'Cheese', but found:" + type);
        }
    }
}
