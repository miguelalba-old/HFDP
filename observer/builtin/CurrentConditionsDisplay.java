package observer.builtin;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;

	public CurrentConditionsDisplay(Observable observable) {
		observable.addObserver(this);
	}

	// Implements Observer
	public void update(Observable obs, Object arg) {
		WeatherData weatherData = (WeatherData) obs;
		this.temperature = weatherData.getTemperature();
		this.humidity = weatherData.getHumidity();
		display();
	}

	// Implements DisplayElement
	public void display() {
		String msg = String.format(
				"Current conditions: %fF degrees and %f%% humidity",
				temperature, humidity);
		System.out.println(msg);
	}
}