package com.ibm.training.basics;

public class ToStringDemo {

	public static void main(String[] args) {
		Point p = new Point(17, 31);

		System.out.println(p);
		
		String message = "Hello "+p; //"Hello ".concat(p.toString())
		
		System.out.println(message);
	}

}
