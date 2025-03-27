package com.nikhil.designPatterns.creational.builder;

public interface ComputerBuilder {
	void buildCPU();

	void buildGPU();

	void buildRAM();

	void buildStorage();

	Computer getResult();
}