package com.nikhil.designPatterns.behavioral.visitor;

public class JsonElement implements DocumentElement {
	private String data;

	public JsonElement(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	@Override
	public void accept(DocumentVisitor visitor) {
		visitor.visit(this); // Delegate to visitor
	}
}
