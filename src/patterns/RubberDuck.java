package patterns;

import patterns.fly.FlyNoWay;
import patterns.quack.Squick;

/**
 * Created by MBCNEWMAIN on 15.03.2016.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehaviour = new Squick();
        flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("rubber duck");
    }
}
