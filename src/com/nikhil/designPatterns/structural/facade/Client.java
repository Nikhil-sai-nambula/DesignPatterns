package com.nikhil.designPatterns.structural.facade;

public class Client {
	public static void main(String[] args) {
		ComputerFacade computer = new ComputerFacade();
		computer.startComputer();
	}
}