package com.nikhil.designPatterns.behavioral.observer;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
		ForecastDisplay forecastDisplay = new ForecastDisplay();

		// Register observers
		weatherData.registerObserver(currentDisplay);
		weatherData.registerObserver(forecastDisplay);

		// Simulate new weather measurements
		weatherData.setMeasurements(75.5f, 60.0f);
		weatherData.setMeasurements(80.0f, 65.5f);

		// Remove an observer
		weatherData.removeObserver(forecastDisplay);
		weatherData.setMeasurements(72.0f, 55.0f);
	}
}