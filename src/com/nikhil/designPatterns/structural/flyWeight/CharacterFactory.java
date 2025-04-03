package com.nikhil.designPatterns.structural.flyWeight;

import java.util.HashMap;
import java.util.Map;
import java.lang.Character;

public class CharacterFactory {
	private static final Map<Character, CharacterFlyweight> pool = new HashMap<>();

	public static CharacterFlyweight getCharacter(char c) {
		return pool.computeIfAbsent(c,
				key -> new com.nikhil.designPatterns.structural.flyWeight.Character(key.charValue()));
	}
}