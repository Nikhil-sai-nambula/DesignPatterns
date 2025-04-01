package com.nikhil.designPatterns.structural.decorator;

public class Client {
	public static void main(String[] args) {
		Beverage coffee = new SimpleCoffee();
		coffee = new MilkDecorator(coffee); // Decorate with milk
		coffee = new SugarDecorator(coffee); // Decorate with sugar

		System.out.println(coffee.getDescription()); // "Simple Coffee, Milk, Sugar"
		System.out.println("Total Cost: $" + coffee.cost()); // $2.7
	}
}