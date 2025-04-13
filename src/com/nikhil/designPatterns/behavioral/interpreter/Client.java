package com.nikhil.designPatterns.behavioral.interpreter;

public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		context.setValue("x", 5);
		context.setValue("y", 3);

		// Build AST for expression: (x + 10) - y
		Expression x = new Variable("x");
		Expression y = new Variable("y");
		Expression expr = new Subtract(new Add(x, new Number(10)), y);

		int result = expr.interpret(context);
		System.out.println("Result: " + result); // Output: (5 + 10) - 3 = 12
	}
}