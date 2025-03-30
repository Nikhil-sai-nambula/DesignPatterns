package com.nikhil.designPatterns.structural.bridge;

public class Client {
	public static void main(String[] args) {
		Device tv = new TV();
		AdvancedRemoteControl remote = new AdvancedRemoteControl(tv);

		remote.togglePower(); // Turns TV on
		remote.volumeUp(); // TV volume: 60
		remote.mute(); // TV volume: 0
	}
}