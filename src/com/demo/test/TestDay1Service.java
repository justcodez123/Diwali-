package com.demo.test;

import com.demo.service.Day1Service;

import java.util.List;
import java.util.Scanner;

public class TestDay1Service{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("1.checkPrime \n 2.generatePrimes \n 3.Calculate Factorial \n 4.Generate Fibonacci ");
			System.out.println("5. Check if odd or even \n 6. Exit");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1 -> {
					System.out.println("Enter a number to check if it is a prime!");
					int n = sc.nextInt();
					boolean res = Day1Service.checkPrime(n);
					
					if(res) {
						System.out.println("The Number is prime");
					}else {
						System.out.println("The number is not prime");
					}
					break;
				}
				
				case 2 -> {
					System.out.println("Enter a number to generate prime no.s upto!");
					int n = sc.nextInt();
					
					List <Integer> res = Day1Service.generatePrime(n);
					if(res != null) {
						System.out.println(String.format(("The Prime No.s from 1 to %d are:"), n));
						for(int v : res) {
							System.out.println(v);
						}
					}else {
						System.out.println("Enter no. greater than 0");
					}
					break;
				}
				
				case 3-> {
					System.out.println("Enter a number to generate factorial!");
					int n = sc.nextInt();
					
					int res = Day1Service.generateFactorial(n);
					if(res == -1) {
						System.out.println("Enter a number which is greater than 0");
					}else {
						System.out.println("Facorial:" + res);
					}
					break;
				}
				
				case 4-> {
					System.out.println("Enter a number to generate fibonacci!");
					int n = sc.nextInt();
					
					int res [] = Day1Service.generateFibo(n);
					if(res != null) {
						System.out.println(String.format(("The fibonacci No.s upto %d are:"), n));
						for(int v : res) {
							System.out.println(v);
						}
					}else {
						System.out.println("Enter no. greater than 0");
					}
					break;
				}
				
				case 5 -> {
					System.out.println("Enter a number to check if it is a even or odd!");
					int n = sc.nextInt();
					boolean res = Day1Service.checkEven(n);
					
					if(res) {
						System.out.println("The Number is even");
					}else {
						System.out.println("The number is odd");
					}
					break;
				}
				
				case 6 -> {
					System.out.println("Thanks for the visit!");
					sc.close();
				}
				
			}
		}while(choice != 6);
		
	}

}
