package com.nikhil.designPatterns.structural.flyWeight;

public class TextEditorClient {
	public static void main(String[] args) {
		String text = "Nikhil";
		for (int i = 0; i < text.length(); i++) {
			CharacterFlyweight charFlyweight = CharacterFactory.getCharacter(text.charAt(i));
			charFlyweight.display(i * 10, 0);
		}
	}
}