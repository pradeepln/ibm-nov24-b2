package com.ibm.training.basics;

public class ReferenceVsObjectsDemo {

	public static void main(String[] args) {
		Point p1; // just a referene. uninitialized
		
		p1 = new Point(10, 20);
		
		Point p2 = p1;
		
		System.out.println("p1 == p2 ? " + (p1 == p2));
		
		Point p3 = new Point(10, 20);
		
		System.out.println("p1 == p3 ? " + (p1 == p3));

		System.out.println("p1.equals(p3) ? " + (p1.equals(p3)));
		
		//Point pointless = new Point();
	}

}
