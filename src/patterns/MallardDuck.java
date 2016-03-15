package patterns;

import patterns.fly.Fly;
import patterns.quack.Quack;
import patterns.quack.QuackBehaviour;

/**
 * Created by MBCNEWMAIN on 15.03.2016.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new Fly();
    }

    @Override
    public void display() {
        System.out.println("mallard duck");
    }

}
