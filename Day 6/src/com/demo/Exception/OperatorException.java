package com.demo.Exception;

/**
 * A custom checked exception thrown when an invalid operator
 * is passed to the Calculator.
 */
public class OperatorException extends Exception {
    
    public OperatorException(String message) {
        // Pass the custom message to the parent Exception class
        super(message);
    }
}