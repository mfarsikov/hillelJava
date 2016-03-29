package patterns.observer;

import java.util.Random;

/**
 * Created by MBCNEWMAIN on 29.03.2016.
 */
public class ForecastDisplay {
    private int temperature;
    private int humidity;
    private int pressure;
    private Random random = new Random();

    public void update(int temperature, int humidity, int pressure) {
        this.temperature = randomize(temperature);
        this.humidity = randomize(humidity);
        this.pressure = randomize(pressure);
    }

    public void display() {
        System.out.println("Forecast: temperature: " + temperature + ", humidity: " + humidity + ", pressure: " + pressure);
    }

    private int randomize(int value) {
        double seed = random.nextDouble() / 5 + 0.9;
        return (int) (value * seed);
    }


}
