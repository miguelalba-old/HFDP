package observer.builtin;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings = 0;

	public StatisticsDisplay(Observable observable) {
		observable.addObserver(this);
	}

	// Implement Observer
	public void update(Observable observable, Object arg) {
		WeatherData weatherData = (WeatherData) observable;

		tempSum += weatherData.getTemperature();
		numReadings++;

		maxTemp = Math.max(maxTemp, weatherData.getTemperature());
		minTemp = Math.min(minTemp, weatherData.getTemperature());
		
		display();
	}

	// Implement DisplayElement
	public void display() {
		String msg = String.format("Avg/Max/Min temperature = %f/%f/%f",
				tempSum / numReadings, maxTemp, minTemp);
		System.out.println(msg);
	}
}