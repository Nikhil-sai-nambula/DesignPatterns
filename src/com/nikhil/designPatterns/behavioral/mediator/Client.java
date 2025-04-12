package com.nikhil.designPatterns.behavioral.mediator;

public class Client {
	public static void main(String[] args) {
		ChatMediator chatRoom = new ChatRoom();

		User alice = new ChatUser(chatRoom, "Alice");
		User bob = new ChatUser(chatRoom, "Bob");
		User charlie = new ChatUser(chatRoom, "Charlie");

		chatRoom.addUser(alice);
		chatRoom.addUser(bob);
		chatRoom.addUser(charlie);

		alice.send("Hello everyone!");
		bob.send("Hi Alice!");
	}
}