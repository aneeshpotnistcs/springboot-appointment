package com.tcs.springbootappointment.exception;

public class AppointmentNotFoundException extends RuntimeException {
	public AppointmentNotFoundException(String message) {
		super(message);
	}
}
