package com.vehicles.custom_exception;

//to tell javac to suppress Serialization related warning
@SuppressWarnings("serial")
public class SpeedOutOfRangeException extends Exception {
	public SpeedOutOfRangeException(String errorMesg) {
		super(errorMesg);
	}
}
