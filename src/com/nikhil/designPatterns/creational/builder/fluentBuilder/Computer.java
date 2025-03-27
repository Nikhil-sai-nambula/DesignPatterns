package com.nikhil.designPatterns.creational.builder.fluentBuilder;

public final class Computer {
	// Required fields
	private final String CPU;
	private final String GPU;

	// Optional fields
	private final int RAM;
	private final int storage;

	// Private constructor (only Builder can access)
	private Computer(Builder builder) {
		this.CPU = builder.CPU;
		this.GPU = builder.GPU;
		this.RAM = builder.RAM;
		this.storage = builder.storage;
	}

	// Getters (no setters for immutability)
	public String getCPU() {
		return CPU;
	}

	public String getGPU() {
		return GPU;
	}

	public int getRAM() {
		return RAM;
	}

	public int getStorage() {
		return storage;
	}

	// Static Builder class
	public static class Builder {
		// Required fields (final)
		private final String CPU;
		private final String GPU;

		// Optional fields (with defaults)
		private int RAM = 8; // Default: 8GB
		private int storage = 256; // Default: 256GB

		// Constructor for required fields
		public Builder(String CPU, String GPU) {
			this.CPU = CPU;
			this.GPU = GPU;
		}

		// Methods for optional fields (return Builder for chaining)
		public Builder RAM(int RAM) {
			this.RAM = RAM;
			return this;
		}

		public Builder storage(int storage) {
			this.storage = storage;
			return this;
		}

		// Validate and build the object
		public Computer build() {
			validate();
			return new Computer(this);
		}

		private void validate() {
			if (CPU == null || GPU == null) {
				throw new IllegalArgumentException("CPU/GPU is required");
			}
			if (RAM < 4) {
				throw new IllegalArgumentException("RAM must be ≥4GB");
			}
		}
	}
}