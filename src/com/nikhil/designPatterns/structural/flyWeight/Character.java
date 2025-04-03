package com.nikhil.designPatterns.structural.flyWeight;

public class Character implements CharacterFlyweight {
	private final char unicode; // Intrinsic state (shared)

	public Character(char unicode) {
		this.unicode = unicode;
	}

	@Override
	public void display(int positionX, int positionY) {
		System.out.printf("Display '%c' at (%d, %d)\n", unicode, positionX, positionY);
	}
}