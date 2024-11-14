package com.ibm.training.system;

import java.io.IOException;
import java.util.Scanner;

public class SystemDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("Goes to console....");
		System.err.println("Goes to console too....");
		
		System.out.println("Enter something from keyboard: ");
		
	
//		int fromKB = System.in.read();
//		
//		System.out.println(fromKB);
//		
//		char c = 97;
//		
//		System.out.println(c);
		
//		Scanner kb = new Scanner(System.in);
//		
//		System.out.println("Enter a word/sentence again:");
//		String input = kb.nextLine();
//		System.out.println(input);
		
		System.out.println(System.getProperties());
		
	}

}
