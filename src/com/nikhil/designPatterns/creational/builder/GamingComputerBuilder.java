package com.nikhil.designPatterns.creational.builder;

// Gaming Computer Builder
public class GamingComputerBuilder implements ComputerBuilder {
	private Computer computer = new Computer();

	@Override
	public void buildCPU() {
		computer.setCPU("Intel i9");
	}

	@Override
	public void buildGPU() {
		computer.setGPU("NVIDIA RTX 4090");
	}

	@Override
	public void buildRAM() {
		computer.setRAM(32);
	}

	@Override
	public void buildStorage() {
		computer.setStorage(2000);
	}

	@Override
	public Computer getResult() {
		return computer;
	}
}

// Office Computer Builder
