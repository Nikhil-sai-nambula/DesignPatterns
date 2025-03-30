package com.nikhil.designPatterns.structural.bridge;

public abstract class RemoteControl {
	protected Device device; // Bridge between Remote and Device

	public RemoteControl(Device device) {
		this.device = device;
	}

	public abstract void togglePower();

	public void volumeUp() {
		device.setVolume(device.getVolume() + 10);
		System.out.println("TV volume: " + device.getVolume());
	}

	public void volumeDown() {
		device.setVolume(device.getVolume() - 10);
		System.out.println("TV volume: " + device.getVolume());
	}
}