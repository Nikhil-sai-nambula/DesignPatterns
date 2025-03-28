package com.nikhil.designPatterns.creational.prototype.expensiveInit;

import java.util.List;

public class FinancialReport implements Cloneable {
	private List<String> data; // Processed data from the database
	private DatabaseConnection dbConnection;

	// Public constructor (costly initialization)
	public FinancialReport(String query) {
		this.dbConnection = new DatabaseConnection(); // Expensive operation
		List<String> rawData = dbConnection.executeQuery(query); // Time-consuming
		this.data = processData(rawData); // CPU-intensive processing
	}

	// Private copy constructor (avoids reinitialization)
	private FinancialReport(List<String> data) {
		this.data = data; // Reuse pre-processed data
	}

	// Clone method uses the copy constructor
	@Override
	public FinancialReport clone() {
		return new FinancialReport(this.data); // No database calls!
	}

	// Simulate data processing
	private List<String> processData(List<String> rawData) {
		// Complex data transformation (e.g., aggregation, filtering)
		return rawData;
	}

	public void printReport() {
		System.out.println("Report Data: " + data);
	}
}