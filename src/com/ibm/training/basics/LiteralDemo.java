package com.ibm.training.basics;

public class LiteralDemo {

	public static void main(String[] args) {

		m1(17);
		m1(17L);
		m1(17D);
		m1(17.0);
		m1(17.0F);

		char a = 'a';
		char b = 66;
		char hindiChar = '\u0961';

		System.out.println(a);
		System.out.println(b);
		System.out.println(hindiChar);

		int simpleInt = 42;

		int withZero = 042; // Octal value
		int withZeroX = 0xcafebabe; // Hexadecimal value

		System.out.println(simpleInt);
		System.out.println(withZero);
		System.out.println(withZeroX);

		// Ranges

		short aShortValue = 32767;

		// short aShortValue = 327671;

		System.out.println(aShortValue);

		aShortValue++;

		System.out.println(aShortValue);

		String name = "pradeep";
	}

	public static void m1(int x) {
		// some logic x
	}

	public static void m1(long x) {
		// some logic y
	}

	public static void m1(double x) {
		// some logic z
	}

	public static void m1(float x) {
		// some logic a
	}

}
