package com.ibm.training.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ibm.training.collections.StringLengthComparator;

public class GenericDemo {
	
	public static <T> T pickOneRandomly(T first,T second) {
		if(Math.random() > 0.5) {
			return first;
		}else {
			return second;
		}
	}
	
	public static <T> void sort(List<T> l, Comparator<T> c) {}

	public static void main(String[] args) {
		//genericType();
		
		String winner = pickOneRandomly("hello", "hi");
		
		System.out.println(winner);
		
		Integer number =  pickOneRandomly(42, 71);
		
		System.out.println(number);
		
		//Car c = pickOneRandomly("he he he", 23);
		
		List<Integer> iList = new ArrayList<>(List.of(12,23,34));
		
		//Collections.sort(iList, new StringLengthComparator());
	}

	private static void genericType() {
		Stack<String> s = new FixedArrayStack<String>(10);
		
		s.push("abc");
		
		String val = s.pop();
		
		//Integer iVal = (Integer) s.pop();
		
	}

}
