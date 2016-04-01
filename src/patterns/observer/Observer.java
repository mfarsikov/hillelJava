package patterns.observer;

/**
 * Created by MBCNEWMAIN on 01.04.2016.
 */
public interface Observer {
    void update(int temperature, int humidity, int pressure);
}
