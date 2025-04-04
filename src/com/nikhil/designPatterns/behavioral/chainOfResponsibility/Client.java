package com.nikhil.designPatterns.behavioral.chainOfResponsibility;

public class Client {
	private static Logger getChainOfLoggers() {
		Logger errorLogger = new ErrorLogger(Logger.ERROR);
		Logger fileLogger = new FileLogger(Logger.DEBUG);
		Logger consoleLogger = new ConsoleLogger(Logger.INFO);

		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		return errorLogger;
	}

	public static void main(String[] args) {
		Logger loggerChain = getChainOfLoggers();

		// Level: INFO (handled by all loggers)
		loggerChain.logMessage(Logger.INFO, "This is an informational message.");
		System.out.println();

		// Level: DEBUG (handled by FileLogger and ConsoleLogger)
		loggerChain.logMessage(Logger.DEBUG, "This is a debug message.");
		System.out.println();

		// Level: ERROR (handled by ErrorLogger only)
		loggerChain.logMessage(Logger.ERROR, "This is an error message.");
	}
}