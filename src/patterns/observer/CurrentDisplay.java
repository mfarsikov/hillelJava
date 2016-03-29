package patterns.observer;

/**
 * Created by MBCNEWMAIN on 29.03.2016.
 */
public class CurrentDisplay {
    private int temperature;
    private int humidity;
    private int pressure;

    public void display() {
        System.out.println("temperature: " + temperature + ", humidity: " + humidity + ", pressure: " + pressure);
    }

    public void update(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

}
