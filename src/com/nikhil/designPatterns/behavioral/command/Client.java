package com.nikhil.designPatterns.behavioral.command;

public class Client {
	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		CommandHistory history = new CommandHistory();

		// Add text
		Command addHello = new AddTextCommand(editor, "Hello, ");
		history.executeCommand(addHello);
		System.out.println("After adding 'Hello, ': " + editor.getContent());

		// Add more text
		Command addWorld = new AddTextCommand(editor, "World!");
		history.executeCommand(addWorld);
		System.out.println("After adding 'World!': " + editor.getContent());

		// Undo last command
		history.undo();
		System.out.println("After undo: " + editor.getContent());
	}
}