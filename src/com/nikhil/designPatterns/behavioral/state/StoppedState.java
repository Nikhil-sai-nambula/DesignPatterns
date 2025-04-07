package com.nikhil.designPatterns.behavioral.state;

public class StoppedState implements PlayerState {
	private MediaPlayer player;

	public StoppedState(MediaPlayer player) {
		this.player = player;
	}

	@Override
	public void play() {
		System.out.println("Starting playback...");
		player.setState(player.getPlayingState());
	}

	@Override
	public void pause() {
		System.out.println("Cannot pause: Player is stopped!");
	}

	@Override
	public void stop() {
		System.out.println("Already stopped!");
	}
}