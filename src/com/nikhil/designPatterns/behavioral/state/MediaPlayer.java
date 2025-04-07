package com.nikhil.designPatterns.behavioral.state;

public class MediaPlayer {
	private PlayerState playingState;
	private PlayerState pausedState;
	private PlayerState stoppedState;
	private PlayerState currentState;

	public MediaPlayer() {
		playingState = new PlayingState(this);
		pausedState = new PausedState(this);
		stoppedState = new StoppedState(this);
		currentState = stoppedState; // Initial state
	}

	public void setState(PlayerState state) {
		this.currentState = state;
	}

	// Delegate actions to the current state
	public void play() {
		currentState.play();
	}

	public void pause() {
		currentState.pause();
	}

	public void stop() {
		currentState.stop();
	}

	// Getters for states
	public PlayerState getPlayingState() {
		return playingState;
	}

	public PlayerState getPausedState() {
		return pausedState;
	}

	public PlayerState getStoppedState() {
		return stoppedState;
	}
}