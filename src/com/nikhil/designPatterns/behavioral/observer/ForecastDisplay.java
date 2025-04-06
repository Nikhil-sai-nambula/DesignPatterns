package com.nikhil.designPatterns.behavioral.observer;

public class ForecastDisplay implements Observer {
	@Override
	public void update(float temperature, float humidity) {
		System.out.println("Forecast: More of the same weather.");
	}
}