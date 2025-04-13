package com.nikhil.designPatterns.behavioral.interpreter;

// Represents numbers  
public class Number implements Expression {
	private int value;

	public Number(int value) {
		this.value = value;
	}

	public int interpret(Context context) {
		return value;
	}
}