package patterns.factory;

import patterns.factory.factory.PizzaFactory;
import patterns.factory.pizza.Pizza;

/**
 * Created by MBCNEWMAIN on 30.05.2016.
 */
public class PizzaStore {
    PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza order(String type) {

        Pizza pizza = pizzaFactory.createPizza(type);

        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /*private Pizza createPizza(String region, String type) {
        if (region.equals("CH")) {
            switch (type) {
                case "Cheese": return new ChicagoCheesePizza();
                case "Meat": return new ChicagoMeatPizza();
                default:
                    throw new RuntimeException("Unexpexted pizza type. " +
                            "Expected 'Meat', 'Cheese', but found:" + type);
            }
        } else if (region.equals("NY")) {
            switch (type) {
                case "Cheese": return new NewYorkCheesePizza();
                case "Meat": return new NewYorkMeatPizza();
                default:
                    throw new RuntimeException("Unexpexted pizza type. " +
                            "Expected 'Meat', 'Cheese', but found:" + type);
            }
        } else {
            throw new RuntimeException("...");
        }
    }*/
}
