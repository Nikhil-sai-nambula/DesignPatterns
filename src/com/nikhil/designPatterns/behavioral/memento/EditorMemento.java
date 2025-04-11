package com.nikhil.designPatterns.behavioral.memento;

public class EditorMemento {
	private final String content; // Immutable state

	public EditorMemento(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}
}