package com.vehicles.service;

import com.vehicles.custom_exception.SpeedOutOfRangeException;

public class VehicleValidations {
  //declare constants
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	static {
		MIN_SPEED=30;
		MAX_SPEED=80;
	}
	// add static method for validating speed
	public static void validateSpeed(int speed) throws SpeedOutOfRangeException
	{
		if (speed < MIN_SPEED)
			throw new SpeedOutOfRangeException("Speed too low ! Can cause Traffic Jam!!!!!");
		if (speed > MAX_SPEED)
			throw new SpeedOutOfRangeException("Speed too high ! Accident prone!!!!!");
		 System.out.println("speed within range !");
	}
}
