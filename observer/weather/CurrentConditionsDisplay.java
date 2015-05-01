package observer.weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	// Implements Observer
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
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
