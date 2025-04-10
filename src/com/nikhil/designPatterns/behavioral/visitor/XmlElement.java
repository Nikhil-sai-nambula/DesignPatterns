package com.nikhil.designPatterns.behavioral.visitor;

public class XmlElement implements DocumentElement {
	private String data;

	public XmlElement(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	@Override
	public void accept(DocumentVisitor visitor) {
		visitor.visit(this);
	}
}