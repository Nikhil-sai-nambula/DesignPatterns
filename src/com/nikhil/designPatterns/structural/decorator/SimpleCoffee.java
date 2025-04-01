package com.nikhil.designPatterns.structural.decorator;

public class SimpleCoffee implements Beverage {
	@Override
	public String getDescription() {
		return "Simple Coffee";
	}

	@Override
	public double cost() {
		return 2.0; // Base price
	}
}