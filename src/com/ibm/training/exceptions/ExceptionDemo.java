package com.ibm.training.exceptions;

import com.ibm.training.basics.Point;

public class ExceptionDemo {

	public static void main(String[] args) {

		/*
		 * int num = 0; int result = calculate(num); System.out.println(result);
		 */

		int dowIndex = -1;
		String day = getDay(dowIndex);
		System.out.println(day);

		/*
		 * Point p = null; draw(p);
		 */

//		kaboom();
	}

	private static void kaboom() {
		double[] bigArray = new double[Integer.MAX_VALUE];
		System.out.println("Memory allocated!");
	}

	private static void draw(Point p) {
		System.out.println("Darawing point at " + p.getX() + " , " + p.getY());
	}

	private static String getDay(int i) {
		try {
			String[] days = new String[] { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };
			return days[i];
		}catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
			return "Bad Index. Check your logic";
		}
	}

	private static int calculate(int i) {
		return 1733 / i;
	}

}
