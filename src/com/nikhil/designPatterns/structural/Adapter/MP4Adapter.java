package com.nikhil.designPatterns.structural.Adapter;

public class MP4Adapter implements MediaPlayer {
	private MP4Player mp4Player;

	public MP4Adapter() {
		this.mp4Player = new MP4Player();
	}

	@Override
	public void play(String fileType, String fileName) {
		if (fileType.equalsIgnoreCase("mp4")) {
			mp4Player.playMP4(fileName); // Adapt the method call
		} else {
			System.out.println("Unsupported format: " + fileType);
		}
	}
}