package com.ibm.training.basics;

public class StackApp {

	public static void main(String[] args) {
		StackUser u = new StackUser();
		
		//FixedArrayStack stackObj = new FixedArrayStack(10);
		
		DynStack stackObj = new DynStack();
		
		u.fill(stackObj);

	}

}
