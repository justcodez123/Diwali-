package com.demo.service;

import java.util.*;

public class Day1Service {
	public static boolean checkPrime(int num) {
		
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				return false;	
			}
		}
		return true;
	}

	public static List<Integer> generatePrime(int n) {
		boolean isPrime []= new boolean[n+1];
		Arrays.fill(isPrime, true);
		
		if(n <= 0) {isPrime[0] = false;};
		if(n <= 1) {isPrime[1] = false;};
		
		/*mark all multiples of 2 as false*/
		for(int p = 2; p*p < n; p++) {
			if(isPrime[p]){
				for(int i=p*p; i<=n; i+=p) {
					isPrime[i] = false;
				}
			}
		}
		
		/*Collecting the numbers which are still marked as true*/
		List <Integer> primeNo = new ArrayList<>();
		for(int i=2; i<n; i++) {
			if(isPrime[i]) {
				primeNo.add(i);;
			}
		}
		
		return primeNo;
	
	}

	public static int generateFactorial(int n) {
		
		if(n == 1 | n==0 ) {
			return 1;
		}
		else if(n < 0){
			return -1;
		}
		else {
			return n*generateFactorial(n-1);
		}
		
	}

	public static int[] generateFibo(int n) {
		if(n <= 0) {
			return new int[0];
		}
		
		int arr [] = new int[n];
		arr[0] = 0;
		
		if(n > 1) {
			//System.out.println(String.format("The first %d digits of Fibonacci:", n));
			arr[1] = 1;
		}
		
		int sum = 0;
		for(int i=2; i<n; i++){
			int j = i-1;
			sum = arr[j];
			sum += arr[j-1];
			arr[i] = sum;
		}
		
		return arr;
		
	}

	public static boolean checkEven(int n) {
		return n%2 == 0;
	}
	
}
