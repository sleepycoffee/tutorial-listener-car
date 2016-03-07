package com.sundance.listener;

public class CarMain {

	public static void main(String[] args) {
		
		Car myCar = new Car(60, 40, 50);

		SpeedListener listener = new CarSpeedListener();
		myCar.addSpeedListener(listener);
		// Add more listeners if you want

		myCar.speedUp(50); // fires SpeedEvent
		myCar.speedUp(50); // fires SpeedEvent
		myCar.slowDown(70);
		myCar.slowDown(70); // fires SpeedEvent
	}
	
}
