package com.ibm.training.basics;

public class DynStack implements Stack {

	//LinkedList or something like that as inst var
	
	@Override
	public void push(Object anElement) {
		// add into Linked List
		System.out.println("DynStack push called");
	}
	
	@Override
	public Object pop() {
		// read and remove from Linked List
		return "dummy";
	}
}
