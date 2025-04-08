package com.nikhil.designPatterns.behavioral.strategy;

public class Client {
	public static void main(String[] args) {
		PaymentProcessor processor = new PaymentProcessor();

		processor.setPaymentStrategy(new CreditCardPayment());
		processor.executePayment(100.0); // Output: Processing $100.0 via Credit Card.

		processor.setPaymentStrategy(new UPIPayment());
		processor.executePayment(50.0); // Output: Processing $50.0 via UPI.
	}
}