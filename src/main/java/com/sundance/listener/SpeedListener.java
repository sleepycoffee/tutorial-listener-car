package com.sundance.listener;

public interface SpeedListener {

	public void speedExceeded(SpeedEvent e);

	public void speedGoneBelow(SpeedEvent e);

}
