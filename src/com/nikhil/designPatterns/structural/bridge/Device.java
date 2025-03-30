package com.nikhil.designPatterns.structural.bridge;

public interface Device {
	
	boolean isEnabled = false;
	
	boolean isEnabled();
	
	void enable();

	void disable();

	void setVolume(int percent);

	int getVolume();
}