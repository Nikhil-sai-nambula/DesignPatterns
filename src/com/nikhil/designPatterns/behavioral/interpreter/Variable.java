package com.nikhil.designPatterns.behavioral.interpreter;

//Represents variables (e.g., "x")  
public class Variable implements Expression {
	private String name;

	public Variable(String name) {
		this.name = name;
	}

	public int interpret(Context context) {
		return context.getValue(name);
	}
}