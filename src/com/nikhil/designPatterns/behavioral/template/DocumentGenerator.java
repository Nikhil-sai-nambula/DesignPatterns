package com.nikhil.designPatterns.behavioral.template;

public abstract class DocumentGenerator {
	// Template method (final to lock the algorithm's structure)
	public final void generateDocument() {
		initialize();
		loadData();
		formatContent(); // Abstract method
		addFooter(); // Hook method (optional override)
		saveDocument();
	}

	// Concrete methods (common steps)
	private void initialize() {
		System.out.println("Initializing document...");
	}

	private void loadData() {
		System.out.println("Loading data from source...");
	}

	// Abstract method (subclasses must implement)
	protected abstract void formatContent();

	// Hook method (subclasses can override if needed)
	protected void addFooter() {
		// Default: No footer
	}

	private void saveDocument() {
		System.out.println("Saving document to storage...");
	}
}