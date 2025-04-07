package com.nikhil.designPatterns.behavioral.state;
public class PlayingState implements PlayerState {
    private MediaPlayer player;

    public PlayingState(MediaPlayer player) {
        this.player = player;
    }

    @Override
    public void play() {
        System.out.println("Already playing!");
    }

    @Override
    public void pause() {
        System.out.println("Pausing...");
        player.setState(player.getPausedState());
    }

    @Override
    public void stop() {
        System.out.println("Stopping...");
        player.setState(player.getStoppedState());
    }
}

