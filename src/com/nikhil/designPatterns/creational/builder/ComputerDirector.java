package com.nikhil.designPatterns.creational.builder;

public class ComputerDirector {
	public Computer buildComputer(ComputerBuilder builder) {
		builder.buildCPU();
		builder.buildGPU();
		builder.buildRAM();
		builder.buildStorage();
		return builder.getResult();
	}
}