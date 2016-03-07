package com.sundance.listener;

public class SpeedEvent {

	private int maxSpeed;
	private int minSpeed;
	private int currentSpeed;

	public SpeedEvent(/*Object source, */ int maxSpeed, int minSpeed, int currentSpeed) {
		// super(source);
		this.maxSpeed = maxSpeed;
		this.minSpeed = minSpeed;
		this.currentSpeed = currentSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getMinSpeed() {
		return minSpeed;
	}

	public void setMinSpeed(int minSpeed) {
		this.minSpeed = minSpeed;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
}
