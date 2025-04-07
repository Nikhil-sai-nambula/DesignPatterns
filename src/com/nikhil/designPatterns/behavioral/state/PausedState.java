package com.nikhil.designPatterns.behavioral.state;
public class PausedState implements PlayerState {
    private MediaPlayer player;

    public PausedState(MediaPlayer player) {
        this.player = player;
    }

    @Override
    public void play() {
        System.out.println("Resuming playback...");
        player.setState(player.getPlayingState());
    }

    @Override
    public void pause() {
        System.out.println("Already paused!");
    }

    @Override
    public void stop() {
        System.out.println("Stopping...");
        player.setState(player.getStoppedState());
    }
}

