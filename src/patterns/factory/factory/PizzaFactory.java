package patterns.factory.factory;

import patterns.factory.pizza.Pizza;

/**
 * Created by MBCNEWMAIN on 30.05.2016.
 */
public interface PizzaFactory {
    Pizza createPizza(String type);
}
