package com.nikhil.designPatterns.behavioral.memento;

public class Client {
	public static void main(String[] args) {
		Editor editor = new Editor();
		History history = new History();

		// Type and save
		editor.type("Hello, ");
		history.save(editor.save());
		editor.print();

		// Type more and save
		editor.type("world!");
		history.save(editor.save());
		editor.print();

		// Undo to previous state
		editor.restoreFromMemento(history.undo());
		System.out.print("After undo: ");
		editor.print();
	}
}