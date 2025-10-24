package com.demo.test;

import com.demo.Exception.OperatorException;
import com.demo.calculator.Calculator;

public class CalculatorDemo {
    public static void main(String[] args) {

        // --- Demonstrating Valid Operations ---
        System.out.println("--- Testing Valid Operations ---");
        try {
            int result1 = Calculator.calculate(10, 5, "+");
            System.out.println("10 + 5 = " + result1); // Expected: 15

            int result2 = Calculator.calculate(10, 5, "*");
            System.out.println("10 * 5 = " + result2); // Expected: 50

        } catch (OperatorException e) {
            // This block will not be executed for valid operators
            System.err.println("Error: " + e.getMessage());
        }

        // --- Demonstrating an Invalid Operation ---
        System.out.println("\n--- Testing an Invalid Operation ---");
        try {
            // We use an invalid operator '^' to trigger the exception
            int result3 = Calculator.calculate(10, 5, "^");
            System.out.println("Result: " + result3);

        } catch (OperatorException e) {
            // The exception is caught and its message is printed
            System.err.println("Caught an expected exception: " + e.getMessage());
        }
    }
}