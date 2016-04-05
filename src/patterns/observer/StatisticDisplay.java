package patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MBCNEWMAIN on 29.03.2016.
 */
public class StatisticDisplay implements Observer {
    private List<Integer> temperatures = new ArrayList<>();
    private List<Integer> humidities = new ArrayList<Integer>();
    private List<Integer> pressures = new ArrayList<Integer>();

    @Override
    public void update(WeatherStation station) {
        temperatures.add(station.getTemperature());
        humidities.add(station.getHumidity());
        pressures.add(station.getPressure());
    }

    public void display() {
        System.out.println("temperatures: " + temperatures +
                ", humidities: " + humidities +
                ", pressures: " + pressures);
    }
}
