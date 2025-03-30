package com.nikhil.designPatterns.structural.bridge;

public class AdvancedRemoteControl extends RemoteControl {
	public AdvancedRemoteControl(Device device) {
		super(device);
	}

	@Override
	public void togglePower() {
		if (device.isEnabled()) {
			device.disable();
		} else {
			device.enable();
		}
	}

	public void mute() {
		device.setVolume(0);
		System.out.println("TV volume: " + device.getVolume());
	}
}