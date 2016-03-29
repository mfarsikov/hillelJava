package patterns.observer;

/**
 * Created by MBCNEWMAIN on 29.03.2016.
 */
public class WeatherStation {
    private int temperature;
    private int humidity;
    private int pressure;

    private CurrentDisplay currentDisplay = new CurrentDisplay();
    private StatisticDisplay statisticDisplay = new StatisticDisplay();
    private ForecastDisplay forecastDisplay = new ForecastDisplay();

    public void stateChanged() {
        currentDisplay.update(temperature, humidity, pressure);
        statisticDisplay.update(temperature, humidity, pressure);
        forecastDisplay.update(temperature, humidity, pressure);

        currentDisplay.display();
        statisticDisplay.display();
        forecastDisplay.display();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
