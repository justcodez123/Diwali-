package com.demo.calculator;

import com.demo.Exception.OperatorException;

public class Calculator {

    /**
     * Performs a calculation based on the provided operator.
     * @param number1 The first operand.
     * @param number2 The second operand.
     * @param operator A string representing the operation (+, -, *, /, %).
     * @return The result of the calculation.
     * @throws WrongOperatorException if the operator is not one of the valid options.
     */
    public static int calculate(int number1, int number2, String operator) throws OperatorException {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                // Note: This will throw a standard ArithmeticException for division by zero.
                return number1 / number2;
            case "%":
                return number1 % number2;
            default:
                // If the operator is anything else, throw our custom exception.
                throw new OperatorException("Invalid operator '" + operator + "'. Please use +, -, *, /, or %.");
        }
    }
}