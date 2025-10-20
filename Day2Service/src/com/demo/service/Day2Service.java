package com.demo.service;
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
 * */

import java.util.ArrayList;
import java.util.List;

public class Day2Service {

	public static List<Integer> evenNums(int n) {
		List<Integer>li = new ArrayList<>();
		
		for(int i=1; i<=n; i++) {
			if(i % 2 == 0) {
				li.add(i);
			}
		}
		
		return li;
	}

	public static List<Integer> sumOdd(int n) {
		List<Integer>li = new ArrayList<>();
		
		for(int i=1; i<=n; i++) {
			if(i % 2 != 0) {
				li.add(i);
			}
		}
		return li;
	}

	public static boolean isPal(int n) {
		String str = Integer.toString(n);
		
		int i = 0;
		int j = str.length() - 1;
		
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}
	
	public static boolean isArm(int n) {
		String s = Integer.toString(n);
		int pwr = s.length();
		
		int remainder = 0; int result = 0;
		while (n != 0) {
			remainder = n % 10;
			result += Math.pow(remainder, pwr);
			n /= 10;
		}
		
		return result != n;
	}

	public static long reverse(int n) {
//		StringBuilder rev = new StringBuilder() ;
//		String str = Integer.toString(n);
//		
//		for(int i=str.length() - 1; i>=0; i--) {
//			rev.append(str.charAt(i));
//		}
//		
//		return Integer.parseInt(rev.toString());
		
		int rem = 0; long res = 0;
		while(n!=0) {
			rem = n % 10;
			res = res*10 + rem;
			n /= 10;
		}
		
		return res;
	}
	
	
	
	
	
}
