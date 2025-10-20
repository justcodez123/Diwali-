package com.demo.test;
import com.demo.service.Day2Service;

import java.util.List;
import java.util.Scanner;

/*
 * 1. Sum of first n even numbers 
o Input: Integer n 
o Output: Sum of first n even numbers 
2. Sum of first n odd numbers 
o Input: Integer n 
o Output: Sum of first n odd numbers 
3. Check if a number is a palindrome 
o Input: Integer n 
o Output: True if reversed number equals original 
4. Check if a number is an Armstrong number 
o Input: Integer n 
o Output: True if sum of digits raised to power equals number 
5. Reverse a number 
o Input: Integer n 
o Output: Reversed integer 

while (originalNumber != 0) {
remainder = originalNumber % 10;
result += Math.pow(remainder, 3);
originalNumber /= 10;
}
}
 * */


public class Day2test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch;
		
		do {
			System.out.println("1.First n even \n2. Sum of first n odd numbers \n3.is no. a palindrome \n4.check if no. Armstrong \n5.Reverse a Number \n6.exit ");
			System.out.println("Enter you choice:");
			ch = sc.nextInt();
			
			switch(ch) {
				case 1 -> {
					System.out.println("Enter the No.");
					int n = sc.nextInt();
					
					List<Integer>res = Day2Service.evenNums(n);
					if(res!=null) {
						System.out.println(String.format("The Even numbers upto %d", n));
						for(int v : res) {
							System.out.println(v);
						}
						System.out.println("");
					}else {
						System.out.println("Enter number greater than 0");
					}
					
				}
				
				case 2 -> {
					System.out.println("Enter the No.");
					int n = sc.nextInt();
					
					List<Integer>res = Day2Service.sumOdd(n);
					if(res!=null) {
						int sum = 0;
						
						for(int v : res) {
							sum += v;
						}
						System.out.println(String.format("The sum of first odd numbers upto %d is :", n) + sum);
						System.out.println("");
					}else {
						System.out.println("Enter number greater than 0");
					}
				}
				
				case 3 -> {
					System.out.println("Enter the No.");
					int n = sc.nextInt();
					
					boolean status= Day2Service.isPal(n);
					if(status) {
						System.out.println("The Number is Palindrome");
						System.out.println();
					}else {
						System.out.println("The number is not palindrome");
						System.out.println();
					}
				}
				
				case 4 -> {
					System.out.println("Enter the No.");
					int n = sc.nextInt();
					
					boolean status= Day2Service.isArm(n);
					if(status) {
						System.out.println("The Number is Armstrong");
						System.out.println();
					}else {
						System.out.println("The Number is not Armstrong");
						System.out.println();
					}
				}
				
				case 5 -> {
					System.out.println("Enter the Integer. ");
					int n = sc.nextInt();
					
					System.out.println("Reversed integer:" + Day2Service.reverse(n));
					
				}
				
				case 6 -> {
					System.out.println("Thanks for the visit!");
					sc.close();
				}
				
				default -> {
					System.out.println("Wrong Choice!");
				}
			}
			
		}while(ch != 6);
		
	}

}
