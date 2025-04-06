package com.nikhil.designPatterns.behavioral.observer;
public class CurrentConditionsDisplay implements Observer {
    private float temperature;
    private float humidity;

    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.printf("Current Conditions: %.1f°F, Humidity: %.1f%%\n", temperature, humidity);
    }
}

