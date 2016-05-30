package patterns.factory.factory;

import enums.PizzaType;
import patterns.factory.pizza.ChicagoCheesePizza;
import patterns.factory.pizza.ChicagoMeatPizza;
import patterns.factory.pizza.Pizza;
import patterns.factory.pizza.ingredients.cheese.Parmejano;
import patterns.factory.pizza.ingredients.dough.Thick;
import patterns.factory.pizza.ingredients.proteins.Meat;

/**
 * Created by MBCNEWMAIN on 30.05.2016.
 */
public class ChPizzaFactory implements PizzaFactory {
    PizzaComponentsFactory pizzaComponentsFactory;

    public ChPizzaFactory(PizzaComponentsFactory pizzaComponentsFactory) {
        this.pizzaComponentsFactory = pizzaComponentsFactory;
    }

    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza pizza;
        switch (type) {
            case CHEESE:
                pizza = new ChicagoCheesePizza(pizzaComponentsFactory);
                return pizza;
            case MEAT:
                pizza = new ChicagoMeatPizza(pizzaComponentsFactory);
                return pizza;
            default:
                throw new RuntimeException("Unexpexted pizza type. " +
                        "Expected 'Meat', 'Cheese', but found:" + type);
        }
    }
}
