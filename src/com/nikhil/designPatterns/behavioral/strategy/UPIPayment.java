package com.nikhil.designPatterns.behavioral.strategy;

public class UPIPayment implements PaymentStrategy {
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing $" + amount + " via UPI.");
	}
}
