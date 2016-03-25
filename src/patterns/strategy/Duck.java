package patterns.strategy;

import patterns.strategy.fly.FlyBehaviour;
import patterns.strategy.quack.QuackBehaviour;

/**
 * Created by MBCNEWMAIN on 15.03.2016.
 */
public abstract class Duck {

    QuackBehaviour quackBehaviour;

    FlyBehaviour flyBehaviour;

    public void fly() {
        flyBehaviour.fly();
    }

    public void swim() {
        System.out.println("I'm swimming");
    }

    public void quack() {
        quackBehaviour.quack();
    }

    public abstract void display();

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

}
