package com.ibm.training.basics;

public class FinalDemo {

	public static void main(String[] args) {
//		final int i = 42;
//		
//		i++;
//		
//		i = i - 1;
		
		
		final Point p = new Point(12, 24);
		
		//p = new Point(23, 43);
		
		//p.x = 71;

	}

}


//final 
class Base{
	
	//final 
	public void m1() {
		
	}
	
}


class Child extends Base{
	
	@Override
	public void m1() {
		
	}
}