package com.nikhil.designPatterns.creational.factoryMethod;

public abstract class VehicleFactory {
	// Factory method
	public abstract Vehicle createVehicle();

	public void deliverVehicle() {
		Vehicle vehicle = createVehicle();
		vehicle.start();
		vehicle.stop();
	}
}