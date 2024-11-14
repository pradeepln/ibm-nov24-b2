package com.ibm.training.strings;

import com.ibm.training.basics.Point;

public class StringConcat {

	public static void main(String[] args) {
		String s1 = "hello ";
		String s2 = "world!";
		
		//String s3 = s1.concat(s2);
		String s3 = s1 + s2; //s1.concat(s2);
		System.out.println(s3);
		
		int i = 21;
		
		String s4 = s1 + i; //s1.concat(String.valueOf(i));
		
		Point p = new Point(23, 35);
		
		String s5 = s1 + p; //s1.concat(p.toString());

		System.out.println(s4);
		System.out.println(s5);
		
		String[] words = new String[]{"this","is","a","long","bunch","of","strange","words","like","xylophone","and","holiday"};
		
		String sentence = formSentence(words);
		
		System.out.println(sentence);
	}

	private static String formSentence(String[] words) {
		StringBuilder buf = new StringBuilder();
		for(int i = 0; i < words.length; i++) {
			buf.append(words[i]);
			buf.append(" ");
		}
		return buf.toString();
	}

	/*
	 * private static String formSentence(String[] words) { String sen = ""; for(int
	 * i = 0; i < words.length; i++) { sen = sen + words[i] + " "; } return sen; }
	 */

}
