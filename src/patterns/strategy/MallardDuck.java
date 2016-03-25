package patterns.strategy;

import patterns.strategy.fly.Fly;
import patterns.strategy.quack.Quack;

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
