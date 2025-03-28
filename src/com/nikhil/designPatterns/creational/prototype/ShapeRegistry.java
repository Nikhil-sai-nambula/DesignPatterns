package com.nikhil.designPatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

//Stores frequently used prototypes for easy access.
public class ShapeRegistry {
	private static Map<String, Shape> prototypes = new HashMap<>();

	static {
		prototypes.put("red_circle", new Circle("red", 10));
	}

	public static Shape getShape(String key) {
		return prototypes.get(key).clone();
	}
}