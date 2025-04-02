package com.nikhil.designPatterns.structural.facade;

class ComputerFacade {
	private CPU cpu;
	private Memory memory;
	private HardDrive hardDrive;

	public ComputerFacade() {
		this.cpu = new CPU();
		this.memory = new Memory();
		this.hardDrive = new HardDrive();
	}

	// Simplified interface for clients
	public void startComputer() {
		cpu.start();
		memory.load();
		hardDrive.read();
		cpu.execute();
		System.out.println("Computer ready!");
	}
}