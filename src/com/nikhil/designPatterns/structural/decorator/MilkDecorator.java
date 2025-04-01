package com.nikhil.designPatterns.structural.decorator;
public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return super.cost() + 0.5; // Add milk cost
    }
}

