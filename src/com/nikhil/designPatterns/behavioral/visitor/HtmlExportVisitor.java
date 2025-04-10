package com.nikhil.designPatterns.behavioral.visitor;

//Visitor 2: Export to HTML  
public class HtmlExportVisitor implements DocumentVisitor {
	@Override
	public void visit(JsonElement json) {
		System.out.println("Converting JSON to HTML: " + json.getData());
	}

	@Override
	public void visit(XmlElement xml) {
		System.out.println("Converting XML to HTML: " + xml.getData());
	}
}