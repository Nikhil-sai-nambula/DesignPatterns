package com.nikhil.designPatterns.structural.proxy;

public class Client {
	public static void main(String[] args) {
		// Proxy handles the heavy loading
		Image image1 = new ProxyImage("nature.jpg");
		Image image2 = new ProxyImage("city.jpg");

		// Image is loaded only when display() is called
		image1.display(); // Output: Loading image: nature.jpg → Displaying image...
		image1.display(); // Output: Displaying image... (already loaded)
		image2.display(); // Output: Loading image: city.jpg → Displaying image...
	}
}