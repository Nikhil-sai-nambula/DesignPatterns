package com.nikhil.designPatterns.structural.composite;

public class Client {
	public static void main(String[] args) {
		// Leaf objects
		FileSystemComponent file1 = new File("report.txt", 100);
		FileSystemComponent file2 = new File("image.jpg", 500);

		// Composite objects
		Directory root = new Directory("Root");
		Directory documents = new Directory("Documents");

		// Build the hierarchy
		root.addComponent(documents);
		root.addComponent(file2);
		documents.addComponent(file1);

		// Treat all components uniformly
		root.showDetails();
		System.out.println("Total size: " + root.getSize() + " KB");
	}
}