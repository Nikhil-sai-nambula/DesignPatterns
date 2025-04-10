package com.nikhil.designPatterns.behavioral.visitor;

//Element interface  
public interface DocumentElement {
	void accept(DocumentVisitor visitor);
}