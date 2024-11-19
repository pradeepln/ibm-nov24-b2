package com.ibm.training.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuiltinFuncIntfDemo {
	
	/*
	 * public static List<String> allMatches(List<String>
	 * inputList,Predicate<String> conditionLogic){ List<String> outputList = new
	 * ArrayList<>(); for(String aValue : inputList) {
	 * if(conditionLogic.test(aValue)) { outputList.add(aValue); } } return
	 * outputList; }
	 */

	public static <T> List<T> allMatches(List<T> inputList,Predicate<T> conditionLogic){
		List<T> outputList = new ArrayList<>();
		for(T aValue : inputList) {
			if(conditionLogic.test(aValue)) {
				outputList.add(aValue);
			}
		}
		return outputList;
	}
	
	/*
	 * public static List<String> transformedList(List<String>
	 * inputList,Function<String, String> transformationLogic){ List<String>
	 * outputList = new ArrayList<>(); for(String aValue : inputList) { String
	 * transformedValue = transformationLogic.apply(aValue);
	 * outputList.add(transformedValue); } return outputList; }
	 */
	
	public static <T,R> List<R> transformedList(List<T> inputList,Function<T,R> transformationLogic){
		List<R> outputList = new ArrayList<>();
		for(T aValue : inputList) {
			R transformedValue = transformationLogic.apply(aValue);
			outputList.add(transformedValue);
		}
		return outputList;
	}
	
	public static void main(String[] args) {
		String[] wordsArray = new String[]{"this","is","a","long","bunch","of","strange","words","like","zarathushtra","aloha","xylophone","and","holiday"};
		List<String> words = Arrays.asList(wordsArray);
		
		List<String> shortWords = allMatches(words, s -> s.length() < 4);
		System.out.println(shortWords);
		List<String> wordsWithB = allMatches(words, s -> s.contains("b"));
		List<String> evenLengthWords = allMatches(words, s -> (s.length() % 2) == 0);
		System.out.println(wordsWithB);
		System.out.println(evenLengthWords);
		
		List<Integer> nums = Arrays.asList(1, 10, 100, 1000, 10000);
		List<Integer> bigNums = allMatches(nums, n -> n>500);
		
		System.out.println(bigNums);
		System.out.println("_____________________________________");
		
		List<String> excitingWords = transformedList(words, s -> s + "!");
		System.out.println(excitingWords);
		List<String> eyeWords = transformedList(words, s -> s.replace("i", "eye"));
		List<String> upperCaseWords = transformedList(words, String::toUpperCase);
		System.out.println(eyeWords);
		System.out.println(upperCaseWords);

		List<Integer> lengths = transformedList(words, s -> s.length());
		System.out.println(lengths);
	}

}
