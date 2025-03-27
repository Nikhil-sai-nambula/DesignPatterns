package com.nikhil.designPatterns.creational.builder.fluentBuilder;

public class FluentBuilderDemo {
	
	public static void main(String[] args) {
		
		// Build a Computer with fluent method chaining
		Computer gamingPC = new Computer.Builder("Intel i9", "RTX 4090").RAM(32).storage(2000).build();

		// Use default optional values for an office PC
		Computer officePC = new Computer.Builder("Intel i5", "Integrated").build();

	}
	
}
