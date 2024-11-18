package com.ibm.training.collections;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
//		Set<String> uniqueWords = new HashSet<>();
		
//		Set<String> uniqueWords = new LinkedHashSet<>();
		
		Set<String> uniqueWords = new TreeSet<>();
		
		Scanner kb = new Scanner(System.in);
		while(true) {
			System.out.println("Enter a unique word:");
			String input = kb.nextLine();
			if(input.equalsIgnoreCase("quit")) { break; }
			
			boolean added = uniqueWords.add(input);
			if(!added) {
				System.out.println("That was a duplicate!");
			}
		}
		System.out.println("________________ All Values _______________");
		
		for(String aWord : uniqueWords) {
			System.out.println(aWord);
		}

	}

}
