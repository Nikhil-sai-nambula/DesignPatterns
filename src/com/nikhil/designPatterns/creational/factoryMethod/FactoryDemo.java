package com.nikhil.designPatterns.creational.factoryMethod;

public class FactoryDemo {
	public static void main(String[] args) {
		VehicleFactory carFactory = new CarFactory();
		carFactory.deliverVehicle();

		VehicleFactory bikeFactory = new BikeFactory();
		bikeFactory.deliverVehicle();
	}
}