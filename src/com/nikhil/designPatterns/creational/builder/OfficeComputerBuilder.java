package com.nikhil.designPatterns.creational.builder;

public class OfficeComputerBuilder implements ComputerBuilder {
	private Computer computer = new Computer();

	@Override
	public void buildCPU() {
		computer.setCPU("Intel i5");
	}

	@Override
	public void buildGPU() {
		computer.setGPU("Integrated Graphics");
	}

	@Override
	public void buildRAM() {
		computer.setRAM(8);
	}

	@Override
	public void buildStorage() {
		computer.setStorage(500);
	}

	@Override
	public Computer getResult() {
		return computer;
	}
}