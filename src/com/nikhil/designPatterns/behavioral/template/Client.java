package com.nikhil.designPatterns.behavioral.template;

public class Client {
	public static void main(String[] args) {
		DocumentGenerator pdfDoc = new PDFGenerator();
		pdfDoc.generateDocument();

		System.out.println();
		
		DocumentGenerator htmlDoc = new HTMLGenerator();
		htmlDoc.generateDocument();
	}
}
