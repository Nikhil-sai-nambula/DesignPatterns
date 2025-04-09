package com.nikhil.designPatterns.behavioral.template;

// PDF Document Generator
public class PDFGenerator extends DocumentGenerator {
	@Override
	protected void formatContent() {
		System.out.println("Formatting content for PDF...");
	}

	@Override
	protected void addFooter() {
		System.out.println("Adding PDF footer with page numbers...");
	}
}