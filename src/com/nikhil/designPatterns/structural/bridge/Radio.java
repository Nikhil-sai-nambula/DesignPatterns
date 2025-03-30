package com.nikhil.designPatterns.structural.bridge;

public class Radio implements Device {

	private boolean isEnabled = false;

	private int volume = 30;

	@Override
	public void enable() {
		isEnabled = true;
		System.out.println("Radio turned on");
	}

	@Override
	public void disable() {
		isEnabled = false;
		System.out.println("Radio turned off");
	}

	@Override
	public void setVolume(int percent) {
		volume = percent;
	}

	@Override
	public int getVolume() {
		return volume;
	}

	@Override
	public boolean isEnabled() {
		return isEnabled;
	}
}