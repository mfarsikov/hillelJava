package patterns.observer;

/**
 * Created by MBCNEWMAIN on 29.03.2016.
 */
public class CurrentDisplay implements Observer{
    private int temperature;
    private int humidity;
    private int pressure;

    public void display() {
        System.out.println("temperature: " + temperature + ", humidity: " + humidity + ", pressure: " + pressure);
    }

    @Override
    public void update(WeatherStation station) {
        this.temperature = station.getTemperature();
        this.humidity = station.getHumidity();
        this.pressure = station.getPressure();
    }

}
