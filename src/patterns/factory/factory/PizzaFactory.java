package patterns.factory.factory;

import enums.PizzaType;
import patterns.factory.pizza.Pizza;

/**
 * Created by MBCNEWMAIN on 30.05.2016.
 */
public interface PizzaFactory {
    Pizza createPizza(PizzaType type);
}
