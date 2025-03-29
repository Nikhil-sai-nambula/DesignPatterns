package com.nikhil.designPatterns.structural.Adapter;

public class Client {
	public static void main(String[] args) {
		MediaPlayer player = new MP4Adapter();
		player.play("mp4", "movie.mp4"); // Output: Playing MP4 file: movie.mp4
		player.play("avi", "movie.avi"); // Output: Unsupported format: avi
	}
}