package patterns.factory.pizza;

import patterns.factory.factory.PizzaComponentsFactory;

/**
 * Created by MBCNEWMAIN on 30.05.2016.
 */
public class ChicagoMeatPizza extends Pizza {
    public ChicagoMeatPizza(PizzaComponentsFactory pizzaComponentsFactory) {
        dough = pizzaComponentsFactory.createDough();
        cheese = pizzaComponentsFactory.createCheese();
        proteins = pizzaComponentsFactory.createProteins();
    }

    @Override
    public void box(){
        System.out.println("Boxing in Chicago box");
    }
}
