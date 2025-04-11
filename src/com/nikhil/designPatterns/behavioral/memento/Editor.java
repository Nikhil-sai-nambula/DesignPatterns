package com.nikhil.designPatterns.behavioral.memento;

public class Editor {
	private String content;

	public void type(String text) {
		content = (content == null) ? text : content + text;
	}

	public EditorMemento save() {
		return new EditorMemento(content);
	}

	public void restoreFromMemento(EditorMemento memento) {
		content = memento.getContent();
	}

	public void print() {
		System.out.println("Current content: " + content);
	}
}