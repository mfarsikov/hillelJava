package patterns.factory.factory;

import patterns.factory.pizza.ingredients.cheese.Cheese;
import patterns.factory.pizza.ingredients.dough.Dough;
import patterns.factory.pizza.ingredients.proteins.Proteins;

/**
 * Created by MBCNEWMAIN on 30.05.2016.
 */
public interface PizzaComponentsFactory {

    Cheese createCheese();

    Dough createDough();

    Proteins createProteins();
}
