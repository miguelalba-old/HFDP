package observer.weather;

public class StatisticsDisplay implements Observer, DisplayElement {

	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings = 0;
	private WeatherData weatherData;

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	// Implement Observer
	public void update(float temp, float humidity, float pressure) {
		tempSum += temp;
		numReadings++;

		maxTemp = Math.max(maxTemp, temp);
		minTemp = Math.min(minTemp, temp);

		display();
	}

	// Implement DisplayElement
	public void display() {
		String msg = String.format("Avg/Max/Min temperature = %f/%f/%f",
				tempSum / numReadings, maxTemp, minTemp);
		System.out.println(msg);
	}
}
