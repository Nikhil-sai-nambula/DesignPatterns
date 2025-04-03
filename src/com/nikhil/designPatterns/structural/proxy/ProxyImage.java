package com.nikhil.designPatterns.structural.proxy;

public class ProxyImage implements Image {
	private String filename;
	private HighResolutionImage realImage;

	public ProxyImage(String filename) {
		this.filename = filename;
	}

	@Override
	public void display() {
		// Lazy initialization: Load the image only when needed
		if (realImage == null) {
			realImage = new HighResolutionImage(filename);
		}
		realImage.display();
	}
}