package com.nikhil.designPatterns.behavioral.iterator;

public class Client {
	public static void main(String[] args) {
		NamesCollection collection = new NamesCollection();
		Iterator<String> iterator = collection.createIterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}