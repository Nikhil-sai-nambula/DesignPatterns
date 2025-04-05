package com.nikhil.designPatterns.behavioral.command;

public class DeleteTextCommand implements Command {
	private TextEditor receiver;
	private String deletedText;

	public DeleteTextCommand(TextEditor receiver, int length) {
		this.receiver = receiver;
		this.deletedText = receiver.getContent().substring(receiver.getContent().length() - length);
	}

	@Override
	public void execute() {
		receiver.deleteText(deletedText.length());
	}

	@Override
	public void undo() {
		receiver.addText(deletedText);
	}
}