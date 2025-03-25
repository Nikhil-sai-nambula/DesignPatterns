package com.nikhil.designPatterns.creational.singleton;

/*
 * Pros: Creates instance only when needed.
 * Cons: Not thread-safe.
*/
public class LazySingleton {
	private static LazySingleton instance;

	private LazySingleton() {
	}

	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}