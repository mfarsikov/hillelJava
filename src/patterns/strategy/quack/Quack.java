package patterns.strategy.quack;

/**
 * Created by MBCNEWMAIN on 15.03.2016.
 */
public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("quack");
    }
}
