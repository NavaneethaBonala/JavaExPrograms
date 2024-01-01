package observerpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

// Subject (Observable)
class WeatherStation extends Observable {
	private float temperature;

	public void setTemperature(float temperature) {
		this.temperature = temperature;
// Mark the object as changed and notify observers
		setChanged();
		notifyObservers(temperature);
	}
}

// Observers
class TemperatureDisplay implements Observer {
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherStation) {
			WeatherStation weatherStation = (WeatherStation) o;
			float temperature = (float) arg;
			System.out.println("Temperature Display: " + temperature + " degrees Celsius");
		}
	}
}

class HumidityDisplay implements Observer {
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherStation) {
			WeatherStation weatherStation = (WeatherStation) o;
// Simulate humidity calculation
			float humidity = temperatureToHumidity((float) arg);
			System.out.println("Humidity Display: " + humidity + "%");
		}
	}

	private float temperatureToHumidity(float temperature) {
// Simulated calculation
		return temperature * 0.2f;
	}
}

public class WeatherApp {
	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();
		TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
		HumidityDisplay humidityDisplay = new HumidityDisplay();
// Register observers
		weatherStation.addObserver(temperatureDisplay);
		weatherStation.addObserver(humidityDisplay);
// Simulate changes in weather conditions
		weatherStation.setTemperature(25.0f);
		weatherStation.setTemperature(30.5f);
	}
}
