package com.nikhil.designPatterns.structural.decorator;

public class SugarDecorator extends CoffeeDecorator {
	public SugarDecorator(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", Sugar";
	}

	@Override
	public double cost() {
		return super.cost() + 0.2; // Add sugar cost
	}
}