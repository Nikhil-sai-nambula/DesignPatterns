package com.nikhil.designPatterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
	Map<String, Integer> variables = new HashMap<>();
	
	protected void setValue(String variable, int value) {
		variables.put(variable, value);
	}
	
	protected int getValue(String variable) {
		return variables.get(variable);
	}
}
