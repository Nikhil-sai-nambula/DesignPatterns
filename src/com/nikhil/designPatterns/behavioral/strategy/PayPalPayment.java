package com.nikhil.designPatterns.behavioral.strategy;

public class PayPalPayment implements PaymentStrategy {
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing $" + amount + " via PayPal.");
	}
}