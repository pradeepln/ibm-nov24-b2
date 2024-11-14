package com.ibm.training.basics;

public class PrimitiveVsReferenceDemo {

	public static void main(String[] args) {
		
		//Primitives - no new
		
		int answer = 42;
		
		char aLetter = 'c';
		
		boolean available = true;
		
		
		
		//References - new
		
		int[] nums = new int[10];
		nums[0] = 42;
		
		StringBuffer sb = new StringBuffer();
		
		
		//primitives are passed by value. Objects and arrays are passed by reference
		
		increment(answer);
		incrementFirstElement(nums);
		
		System.out.println(answer);
		System.out.println(nums[0]);

	}

	public static void increment(int x) {
		x++; // x = x + 1;
	}
	
	public static void incrementFirstElement(int[] arr) {
		arr[0]++;
	}
}
