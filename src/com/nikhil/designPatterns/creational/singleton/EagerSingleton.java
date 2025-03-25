package com.nikhil.designPatterns.creational.singleton;

/* 
 * Pros: Simple, thread-safe.
 * Cons: Instance created at class load time (even if unused).
 */
public class EagerSingleton {
	// Eagerly create the instance
	private static final EagerSingleton instance = new EagerSingleton();

	// Private constructor
	private EagerSingleton() {
	}

	// Global access point
	public static EagerSingleton getInstance() {
		return instance;
	}
}
