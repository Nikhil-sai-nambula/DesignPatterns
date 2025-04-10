package com.nikhil.designPatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<DocumentElement> elements = new ArrayList<>();
		elements.add(new JsonElement("{ key: 'value' }"));
		elements.add(new XmlElement("<data>value</data>"));

		DocumentVisitor pdfVisitor = new PdfExportVisitor();
		DocumentVisitor htmlVisitor = new HtmlExportVisitor();

		// Export to PDF
		for (DocumentElement element : elements) {
			element.accept(pdfVisitor);
		}

		System.out.println("-------------------");

		// Export to HTML
		for (DocumentElement element : elements) {
			element.accept(htmlVisitor);
		}
	}
}