package com.nikhil.designPatterns.behavioral.command;

import java.util.Stack;

public class CommandHistory {
	private Stack<Command> history = new Stack<>();

	public void executeCommand(Command command) {
		command.execute();
		history.push(command);
	}

	public void undo() {
		if (!history.isEmpty()) {
			Command command = history.pop();
			command.undo();
		}
	}
}