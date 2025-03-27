package com.nikhil.designPatterns.creational.builder;

public class BuilderDemo {
	public static void main(String[] args) {
		ComputerDirector director = new ComputerDirector();

		Computer gamingPC = director.buildComputer(new GamingComputerBuilder());
		System.out.println("Gaming PC: " + gamingPC);

		Computer officePC = director.buildComputer(new OfficeComputerBuilder());
		System.out.println("Office PC: " + officePC);
	}
}