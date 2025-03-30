package com.nikhil.designPatterns.structural.bridge;

public class TV implements Device {

	private boolean isEnabled = false;

	private int volume = 50;

	@Override
	public void enable() {
		isEnabled = true;
		System.out.println("TV turned on");
	}

	@Override
	public void disable() {
		isEnabled = false;
		System.out.println("TV turned off");
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
