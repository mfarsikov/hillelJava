package patterns.strategy.fly;

/**
 * Created by MBCNEWMAIN on 15.03.2016.
 */
public class Rocket implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("YAHOOOO! I'm flying on the rocket!!!");
    }
}
