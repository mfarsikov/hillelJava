package patterns.factory.pizza;

import patterns.factory.pizza.ingredients.cheese.Cheese;
import patterns.factory.pizza.ingredients.dough.Dough;
import patterns.factory.pizza.ingredients.proteins.Proteins;

/**
 * Created by MBCNEWMAIN on 30.05.2016.
 */
public class Pizza {
    public Cheese cheese;
    public Dough dough;
    public Proteins proteins;

    public void bake(){
        System.out.println("Baking...");
    }
    public void cut(){
        System.out.println("Cutting");
    }
    public void box(){
        System.out.println("Boxing");
    }
}
