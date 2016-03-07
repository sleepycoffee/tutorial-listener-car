package com.sundance.listener;

import java.util.ArrayList;
import java.util.List;

public class Car {

	private List<SpeedListener> speedListenerList = new ArrayList<SpeedListener>();
	private int currentSpeed;
	private int maxSpeed;
	private int minSpeed;

	public Car(int maxSpeed, int minSpeed, int currentSpeed) {
		this.currentSpeed = currentSpeed;
		this.maxSpeed = maxSpeed;
		this.minSpeed = minSpeed;
	}

	public synchronized void addSpeedListener(SpeedListener listener) {
		if (!speedListenerList.contains(listener)) {
			speedListenerList.add(listener);
		}
	}

	private synchronized void processSpeedEvent(SpeedEvent speedEvent) {

		if (speedListenerList.size() == 0) {
			return;
		}

		for (SpeedListener listener : speedListenerList) {
			listener.speedExceeded(speedEvent);
			listener.speedGoneBelow(speedEvent);
		}
	}

	public void speedUp(int increment) {
		this.currentSpeed += increment;
		if (this.currentSpeed > this.maxSpeed) {
			// fire SpeedEvent
			processSpeedEvent(new SpeedEvent(this.maxSpeed, this.minSpeed, this.currentSpeed));
		}		
	}
	
	public void slowDown(int increment) {
		this.currentSpeed -= increment;
		if (this.currentSpeed < this.minSpeed) {
			// fire SpeedEvent
			processSpeedEvent(new SpeedEvent(this.maxSpeed, this.minSpeed, this.currentSpeed));
		}		
	}
}
