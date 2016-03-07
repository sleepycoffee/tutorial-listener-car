package com.sundance.listener;

public class CarSpeedListener implements SpeedListener {


	public void speedExceeded(SpeedEvent e) {

		if (e.getCurrentSpeed() > e.getMaxSpeed()) {
			System.out.println("Alert! You have exceeded " + (e.getCurrentSpeed() - e.getMaxSpeed() + " MPH!"));
		}

	}

	public void speedGoneBelow(SpeedEvent e) {
		if (e.getCurrentSpeed() < e.getMinSpeed()) {
			System.out.println("Uhm... you are driving " + e.getCurrentSpeed() + " MPH. Speed up!");
		}
	}

}
