package com.studs.exception;

public class LowAttendanceException extends Exception{
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	public LowAttendanceException(String message) {
        // Pass the message to the parent Exception class
        super(message);
    }
}
