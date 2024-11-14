package com.ibm.training.basics;

public class FixedArrayStack implements Stack {

	Object[] contents;
	int top = -1;
	
	public FixedArrayStack(int capacity) {
		contents = new Object[capacity];
	}
	
	@Override
	public void push(Object anElement) {
		contents[++top] = anElement;
		System.out.println("FAS push called");
	}
	
	@Override
	public Object pop() {
		return contents[top--];
	}
	
}
