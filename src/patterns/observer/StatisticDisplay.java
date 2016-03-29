package patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MBCNEWMAIN on 29.03.2016.
 */
public class StatisticDisplay {
    private List<Integer> temperatures = new ArrayList<Integer>();
    private List<Integer> humidities = new ArrayList<Integer>();
    private List<Integer> pressures = new ArrayList<Integer>();

    public void update(int temperature, int humidity, int pressure) {
        temperatures.add(temperature);
        humidities.add(humidity);
        pressures.add(pressure);
    }

    public void display() {
        System.out.println("temperatures: " + temperatures +
                ", humidities: " + humidities +
                ", pressures: " + pressures);
    }
}
