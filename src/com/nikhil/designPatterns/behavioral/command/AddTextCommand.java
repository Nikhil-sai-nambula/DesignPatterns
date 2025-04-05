package com.nikhil.designPatterns.behavioral.command;
public class AddTextCommand implements Command {
    private TextEditor receiver;
    private String text;

    public AddTextCommand(TextEditor receiver, String text) {
        this.receiver = receiver;
        this.text = text;
    }

    @Override
    public void execute() {
        receiver.addText(text);
    }

    @Override
    public void undo() {
        receiver.deleteText(text.length());
    }
}

