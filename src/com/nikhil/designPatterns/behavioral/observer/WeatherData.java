package com.nikhil.designPatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	private List<Observer> observers = new ArrayList<>();
	private float temperature;
	private float humidity;

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(temperature, humidity);
		}
	}

	// Called when measurements change
	public void setMeasurements(float temperature, float humidity) {
		this.temperature = temperature;
		this.humidity = humidity;
		notifyObservers();
	}
}