package com.nikhil.designPatterns.creational.prototype;

public class Client {
	public static void main(String[] args) {
		Circle redCircle = new Circle("red", 10);
		Circle clonedCircle = (Circle) redCircle.clone();
		clonedCircle.draw(); // Output: Drawing a red Circle radius : 10
	}
}