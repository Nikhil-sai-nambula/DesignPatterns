package com.nikhil.designPatterns.behavioral.iterator;

public class NamesCollection {
	private String[] names = { "Alice", "Bob", "Charlie", "Diana" };

	public Iterator<String> createIterator() {
		return new NamesIterator(names);
	}
}
