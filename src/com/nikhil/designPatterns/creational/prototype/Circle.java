package com.nikhil.designPatterns.creational.prototype;

public class Circle implements Shape {
	private String color;
	private int radius;

	public Circle(String color, int radius) {
		this.color = color;
		this.radius = radius;
	}

	@Override
	public Shape clone() {
		return new Circle(this.color, this.radius); // Deep copy
	}

	@Override
	public void draw() {
		System.out.println("Drawing a " + color + " Circle " + "radius : " + radius);
	}
}