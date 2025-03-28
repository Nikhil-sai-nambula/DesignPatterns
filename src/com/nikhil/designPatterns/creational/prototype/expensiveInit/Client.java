package com.nikhil.designPatterns.creational.prototype.expensiveInit;

public class Client {
	public static void main(String[] args) {
		// Initial report (costly initialization)
		FinancialReport originalReport = new FinancialReport("SELECT * FROM sales");
		originalReport.printReport();

		// Clone the report (cheap)
		FinancialReport clonedReport = originalReport.clone();
		clonedReport.printReport();
	}
}