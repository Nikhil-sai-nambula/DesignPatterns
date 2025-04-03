package com.nikhil.designPatterns.structural.proxy;

public class HighResolutionImage implements Image {
	private String filename;

	public HighResolutionImage(String filename) {
		this.filename = filename;
		loadFromDisk(); // Expensive operation
	}

	private void loadFromDisk() {
		System.out.println("Loading image: " + filename);
	}

	@Override
	public void display() {
		System.out.println("Displaying image: " + filename);
	}
}