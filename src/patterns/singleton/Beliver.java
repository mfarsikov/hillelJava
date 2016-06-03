package patterns.singleton;

/**
 * Created by MBCNEWMAIN on 03.06.2016.
 */
public class Beliver {
    static God god;
    String name;

    @Override
    public String toString(){
        return "my name is " + name + " I believe in " + god.getName();
    }
}
