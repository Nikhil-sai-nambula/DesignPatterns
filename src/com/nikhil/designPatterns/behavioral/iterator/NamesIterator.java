package com.nikhil.designPatterns.behavioral.iterator;

public class NamesIterator implements Iterator<String> {

	String[] names = null;
	int index = 0;

	public NamesIterator(String[] names) {
		this.names = names;
	}

	@Override
	public boolean hasNext() {
		return index < names.length;
	}

	@Override
	public String next() {
		if (hasNext()) {
			return names[index++];
		}
		return null;
	}

}
