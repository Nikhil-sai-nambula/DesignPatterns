package com.nikhil.designPatterns.behavioral.template;

//HTML Document Generator
public class HTMLGenerator extends DocumentGenerator {
	@Override
	protected void formatContent() {
		System.out.println("Formatting content for HTML...");
	}
}