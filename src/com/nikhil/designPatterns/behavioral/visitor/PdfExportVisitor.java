package com.nikhil.designPatterns.behavioral.visitor;

// Visitor 1: Export to PDF  
public class PdfExportVisitor implements DocumentVisitor {
	@Override
	public void visit(JsonElement json) {
		System.out.println("Converting JSON to PDF: " + json.getData());
	}

	@Override
	public void visit(XmlElement xml) {
		System.out.println("Converting XML to PDF: " + xml.getData());
	}
}