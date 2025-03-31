package com.nikhil.designPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
	private String name;
	private List<FileSystemComponent> children = new ArrayList<>();

	public Directory(String name) {
		this.name = name;
	}

	public void addComponent(FileSystemComponent component) {
		children.add(component);
	}

	public void removeComponent(FileSystemComponent component) {
		children.remove(component);
	}

	@Override
	public void showDetails() {
		System.out.println("Directory: " + name);
		for (FileSystemComponent child : children) {
			child.showDetails();
		}
	}

	@Override
	public long getSize() {
		long totalSize = 0;
		for (FileSystemComponent child : children) {
			totalSize += child.getSize();
		}
		return totalSize;
	}
}