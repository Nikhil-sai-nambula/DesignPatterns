package com.nikhil.designPatterns.behavioral.strategy;

public class PaymentProcessor {
	private PaymentStrategy strategy;

	public void setPaymentStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}

	public void executePayment(double amount) {
		strategy.processPayment(amount);
	}
}