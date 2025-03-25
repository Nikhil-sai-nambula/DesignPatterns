package com.nikhil.designPatterns.creational.singleton;

public class SingletonDemo {
	public static void main(String[] args) {
		EagerSingleton eager1 = EagerSingleton.getInstance();
		EagerSingleton eager2 = EagerSingleton.getInstance();
		System.out.println(eager1 == eager2); // true
	}
}
