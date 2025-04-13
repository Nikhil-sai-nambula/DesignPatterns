package com.nikhil.designPatterns.behavioral.interpreter;

//Represents subtraction
public class Subtract implements Expression {
	private Expression left;
	private Expression right;

	public Subtract(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	public int interpret(Context context) {
		return left.interpret(context) - right.interpret(context);
	}
}