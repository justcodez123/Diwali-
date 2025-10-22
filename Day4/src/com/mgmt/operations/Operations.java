package com.mgmt.operations;

public class Operations {

    /** 1. Adds two numbers */
    public static int add(int a, int b) {
        return a + b;
    }

    /** 2. Prints the multiplication table of a number */
    public static void printMultiplicationTable(int n) {
        System.out.println("---- Multiplication Table for " + n + " ----");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %2d = %d\n", n, i, (n * i));
        }
        System.out.println("------------------------------------");
    }

    /** 3. Prints number patterns */
    public static void printNumberPatterns(int r) {
        System.out.println("\n--- Right-Angled Triangle ---");
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\n--- Pyramid ---");
        for (int i = 1; i <= r; i++) {
            // Print leading spaces
            for (int j = 1; j <= r - i; j++) {
                System.out.print("  ");
            }
            // Print numbers
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /** 4. Calculates the sum of digits of a number */
    public static int sumOfDigits(int n) {
        int sum = 0;
        int num = Math.abs(n); // Handle negative numbers
        while (num > 0) {
            sum += num % 10; // Add the last digit
            num /= 10;       // Remove the last digit
        }
        return sum;
    }

    /** Helper method to find GCD using Euclidean algorithm */
    private static int findGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /** 5. Finds and prints GCD and LCM of two numbers */
    public static void findGcdAndLcm(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("GCD and LCM are not defined for zero.");
            return;
        }
        int gcd = findGcd(Math.abs(a), Math.abs(b));
        long lcm = (long) Math.abs(a) * (Math.abs(b) / gcd);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}