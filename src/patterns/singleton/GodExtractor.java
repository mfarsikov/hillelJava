package patterns.singleton;

/**
 * Created by MBCNEWMAIN on 03.06.2016.
 */
public class GodExtractor implements Runnable{
    TheGod god;
    @Override
    public void run() {
        god = TheGod.getInstance();
    }
}
