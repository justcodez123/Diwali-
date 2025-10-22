package com.demo.menu;

import com.mgmt.operations.Operations;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Addition of two numbers");
            System.out.println("2. Print multiplication table");
            System.out.println("3. Print number pattern");
            System.out.println("4. Sum of digits of a number");
            System.out.println("5. Find GCD and LCM of two numbers");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();
                    int sum = Operations.add(a, b);
                    System.out.println("Result: " + a + " + " + b + " = " + sum);
                    break;
                case 2:
                    System.out.print("Enter a number to generate its table: ");
                    int n_table = sc.nextInt();
                    Operations.printMultiplicationTable(n_table);
                    break;
                case 3:
                    System.out.print("Enter the number of rows for the patterns: ");
                    int rows = sc.nextInt();
                    Operations.printNumberPatterns(rows);
                    break;
                case 4:
                    System.out.print("Enter a number to find the sum of its digits: ");
                    int n_sum = sc.nextInt();
                    int digitSum = Operations.sumOfDigits(n_sum);
                    System.out.println("Sum of digits of " + n_sum + " is: " + digitSum);
                    break;
                case 5:
                    System.out.print("Enter first number: ");
                    int x = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int y = sc.nextInt();
                    Operations.findGcdAndLcm(x, y);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 6);

    }
}