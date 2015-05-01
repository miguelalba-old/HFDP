package observer.weather;

public class ForecastDisplay implements Observer, DisplayElement {
	
	private float currentPressure = 29.92f;
	private float lastPressure;
	private WeatherData weatherData;
	
	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	// Implement Observer
	public void update(float temp, float humidity, float pressure) {
		lastPressure = currentPressure;
		currentPressure = pressure;
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