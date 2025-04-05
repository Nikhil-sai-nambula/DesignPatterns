package com.nikhil.designPatterns.behavioral.command;

public class TextEditor {
	private StringBuilder content = new StringBuilder();

	public void addText(String text) {
		content.append(text);
	}

	public void deleteText(int length) {
		if (content.length() >= length) {
			content.delete(content.length() - length, content.length());
		}
	}

	public String getContent() {
		return content.toString();
	}
}