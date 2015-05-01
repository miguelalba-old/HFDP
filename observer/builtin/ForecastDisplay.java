package observer.builtin;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

	private float currentPressure = 29.92f;
	private float lastPressure;

	public ForecastDisplay(Observable observable) {
		observable.addObserver(this);
	}

	// Implement Observer
	public void update(Observable observable, Object arg) {
		WeatherData weatherData = (WeatherData) observable;
		lastPressure = currentPressure;
		currentPressure = weatherData.getPressure();
		display();

	}

	// Implement DisplayElement
	public void display() {
		System.out.print("Forecast: ");
		String forecastMsg;
		if (currentPressure > lastPressure) {
			forecastMsg = "Improving weather on the way!";
		} else if (currentPressure == lastPressure) {
			forecastMsg = "More of the same";
		} else {
			forecastMsg = "Watch out for cooler, rainy weather";
		}
		System.out.println(forecastMsg);
	}
}