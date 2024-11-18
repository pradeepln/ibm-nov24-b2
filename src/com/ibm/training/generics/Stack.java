package com.ibm.training.generics;

public interface Stack<E> {
	
	void push(E anElement);
	E pop();
	
	default int size() {
		return -1;
		//throw new RuntimeException("Method not implemented");
	}
}
