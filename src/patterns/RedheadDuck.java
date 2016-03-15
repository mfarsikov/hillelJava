package patterns;

import patterns.fly.Fly;
import patterns.quack.Quack;

/**
 * Created by MBCNEWMAIN on 15.03.2016.
 */
public class RedheadDuck extends Duck {

    public RedheadDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new Fly();
    }

    @Override
    public void display() {
        System.out.println("redhead duck");
    }

}
