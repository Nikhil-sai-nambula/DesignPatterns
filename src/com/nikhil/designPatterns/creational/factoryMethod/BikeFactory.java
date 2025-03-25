package com.nikhil.designPatterns.creational.factoryMethod;

public class BikeFactory extends VehicleFactory {
	@Override
	public Vehicle createVehicle() {
		return new Bike();
	}
}