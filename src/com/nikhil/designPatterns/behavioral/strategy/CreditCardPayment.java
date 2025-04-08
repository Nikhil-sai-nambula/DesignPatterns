package com.nikhil.designPatterns.behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy {
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing $" + amount + " via Credit Card.");
	}
}
