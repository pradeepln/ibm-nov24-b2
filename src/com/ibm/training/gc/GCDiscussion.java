package com.ibm.training.gc;

import com.ibm.training.basics.Car;
import com.ibm.training.basics.ChemicalElement;
import com.ibm.training.basics.Point;

public class GCDiscussion {

	public static void main(String[] args) {
		
		int iMain = 42;
		m1();
		//D
	}

	private static void m1() {
		float fM1 = 21.1f;
		Point p1 = new Point(21, 31);
		m2();
		//C
		
	}

	private static void m2() {
		char c ='\u4301';
		ChemicalElement h = new ChemicalElement(1, "Hydrogen", "H");
		m3(h);
		//B
	}

	private static void m3(ChemicalElement x) {
		double d = 43.1;
		Car car = new Car();
		//A
		
		x.isAlkaliMetal();
		car.playMusic();
	}

}
