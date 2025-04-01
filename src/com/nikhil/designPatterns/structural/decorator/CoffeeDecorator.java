package com.nikhil.designPatterns.structural.decorator;

public abstract class CoffeeDecorator implements Beverage {
	protected Beverage decoratedBeverage;

	public CoffeeDecorator(Beverage beverage) {
		this.decoratedBeverage = beverage;
	}

	@Override
	public String getDescription() {
		return decoratedBeverage.getDescription();
	}

	@Override
	public double cost() {
		return decoratedBeverage.cost();
	}
}