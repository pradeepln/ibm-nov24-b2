package com.ibm.training.varargs;
//DRY
public class VarArgsDemo {
	
	/*
	 * public static int sum(int n1,int n2) { int sum; sum = n1 + n2; return sum; }
	 * 
	 * public static int sum(int n1,int n2,int n3) { int sum; sum = n1 + n2 + n3;
	 * return sum; }
	 */

	public static int sum(int... nums) {
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int addedSum = sum(14,17);
		System.out.println(addedSum);
		
		addedSum = sum(14, 17, 21);
		System.out.println(addedSum);
		
		
	}

}
