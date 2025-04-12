package com.nikhil.designPatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
	private List<User> users = new ArrayList<>();

	@Override
	public void addUser(User user) {
		users.add(user);
	}

	@Override
	public void sendMessage(String message, User sender) {
		System.out.println("[" + sender.getName() + " sends]: " + message);
		for (User user : users) {
			// Don't send the message back to the sender
			if (user != sender) {
				user.receive(message);
			}
		}
	}
}