package com.nikhil.designPatterns.creational.prototype.expensiveInit;

import java.util.List;

public class DatabaseConnection {
	public List<String> executeQuery(String query) {
		// Simulate a slow database query (e.g., 2 seconds)
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return List.of("$100 revenue", "$50 expenses", "$50 profit");
	}
}