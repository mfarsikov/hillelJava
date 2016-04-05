package patterns.observer;

import java.util.Random;

/**
 * Created by MBCNEWMAIN on 29.03.2016.
 */
public class ForecastDisplay implements Observer {
    private int temperature;
    private int humidity;
    private int pressure;
    private Random random = new Random();

    @Override
    public void update(WeatherStation station) {
        this.temperature = randomize(station.getTemperature());
        this.humidity = randomize(station.getHumidity());
        this.pressure = randomize(station.getPressure());
    }

    public void display() {
        System.out.println("Forecast: temperature: " + temperature + ", humidity: " + humidity + ", pressure: " + pressure);
    }

    private int randomize(int value) {
        double seed = random.nextDouble() / 5 + 0.9;
        return (int) (value * seed);
    }


}
