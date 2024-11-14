package com.ibm.training.basics;

public class TypeCastDemo {

	public static void main(String[] args) {
		int i = 999999;
		
		long l = i; //implicit typecast
		
		short s = (short) i; //explicit

		System.out.println(s);
		
		float f = 17.15f;
		
		int j = (int) f; //explicit
		
		System.out.println(j);
	}

}
