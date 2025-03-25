package com.nikhil.designPatterns.creational.singleton;

/*
 * Pros: Thread-safe, serialization-safe, reflection-safe.
 * Cons: Not flexible (e.g., no lazy initialization).
 */
public enum EnumSingleton {
	// Single instance
	INSTANCE;

	// Example method
	public void doSomething() {
		System.out.println("Singleton working!");
	}
}
