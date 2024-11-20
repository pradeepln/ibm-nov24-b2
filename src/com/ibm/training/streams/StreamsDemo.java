package com.ibm.training.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
		String[] wordsArray = new String[]{"this","is","a","long","bunch","of","strange","words","like","zarathushtra","aloha","xylophone","and","holiday"};
		List<String> words = Arrays.asList(wordsArray);
		
		//Stream.of(wordsArray).forEach(aString -> System.out.println(aString));
		
		/*
		 * for(String aString : wordsArray) { System.out.println(aString); }
		 */
		
		//Stream.of(wordsArray).parallel().forEach(System.out::println);
		
		List<String> upperCaseWords =
										words
										.stream()
										.map(s -> s.toUpperCase())
										.toList();
		System.out.println(upperCaseWords);
		
		/*
		 * words .stream() .map(s -> s.trim()) .map(s -> s.length()) .map(i -> i*i)
		 * .forEach(System.out::println);
		 */
		
		List<String> wordsWithB = words.stream().filter(s -> s.contains("b")).toList();
		System.out.println(wordsWithB);
		
		words
			.stream()
			.filter(s -> s.length() > 3)
			.map(s -> s.length())
			.filter(i -> i % 2 == 0)
			.forEach(System.out::println);
		
		//printSpecial("abc");
		
		//words.stream().forEach(s -> printSpecial(s));
	}

	
//	public static String printSpecial(String x) {
//		String special = x + "!";
//		System.out.println(special);
//		return special;
//	}
}
