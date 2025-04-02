package com.nikhil.designPatterns.structural.facade;

// Complex subsystem classes
class CPU {
	public void start() {
		System.out.println("CPU started");
	}

	public void execute() {
		System.out.println("CPU executing");
	}
}

class Memory {
	public void load() {
		System.out.println("Memory loaded");
	}
}

class HardDrive {
	public void read() {
		System.out.println("HardDrive reading");
	}
}