package patterns.factory.pizza;

import patterns.factory.factory.PizzaComponentsFactory;

/**
 * Created by MBCNEWMAIN on 30.05.2016.
 */
public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza(PizzaComponentsFactory pizzaComponentsFactory) {
        dough = pizzaComponentsFactory.createDough();
        cheese = pizzaComponentsFactory.createCheese();
    }

    @Override
    public void box(){
        System.out.println("Boxing in Chicago box");
    }
}
