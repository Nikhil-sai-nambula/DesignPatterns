package com.nikhil.designPatterns.behavioral.visitor;

// Visitor interface  
public interface DocumentVisitor {
	void visit(JsonElement json);

	void visit(XmlElement xml);
}