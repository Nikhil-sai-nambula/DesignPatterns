package com.nikhil.designPatterns.creational.singleton;

/*
 * Pros: Thread-safe.
 * Cons: Performance overhead due to synchronization.
 */
public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
	}

	// Synchronized method to control concurrent access
	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
}