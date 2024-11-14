package com.ibm.training.exceptions;

public class FixedArrayStack implements Stack {

	Object[] contents;
	int top = -1;
	
	public FixedArrayStack(int capacity) {
		contents = new Object[capacity];
	}
	
	@Override
	public void push(Object anElement) {
		if(top == contents.length - 1) {
			throw new StackFullException("Stack Overflow.Capacity="+contents.length);
		}
		contents[++top] = anElement;
		System.out.println("FAS push called");
	}
	
	@Override
	public Object pop() {
		if(top == -1) {
			throw new StackEmptyException("Stack is empty!!");
		}
		return contents[top--];
	}
	
}
