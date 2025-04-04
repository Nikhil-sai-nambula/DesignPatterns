package com.nikhil.designPatterns.behavioral.chainOfResponsibility;

public abstract class Logger {
	public static int INFO = 3;
	public static int DEBUG = 2;
	public static int ERROR = 1;

	protected int level;
	protected Logger nextLogger; // Next handler in the chain

	public void setNextLogger(Logger nextLogger) {
		this.nextLogger = nextLogger;
	}

	public void logMessage(int level, String message) {
		if (this.level <= level) {
			write(message); // Handle the request
		}
		if (nextLogger != null) {
			nextLogger.logMessage(level, message); // Pass to next handler
		}
	}

	abstract protected void write(String message);
}