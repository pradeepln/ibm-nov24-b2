package com.ibm.training.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ibm.training.basics.ChemicalElement;

public class SortDemo {

	public static void main(String[] args) {
		//sortArrayOfStrings();
		//sortListOfStrings();
		//sortListOfChemicalElements();
		//sortListOfStringsOnLength();
		sortListOfStringsOnLengthUsingAnon();
	}

	private static void sortListOfStringsOnLengthUsingAnon() {
		String[] words = new String[]{"this","is","a","long","bunch","of","strange","words","like","zarathushtra","aloha","xylophone","and","holiday"};
		List<String> wordList = Arrays.asList(words);
		System.out.println(wordList);
		
		Collections.sort(wordList,new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});
		
		System.out.println(wordList);
	}
	
	private static void sortListOfStringsOnLength() {
		String[] words = new String[]{"this","is","a","long","bunch","of","strange","words","like","zarathushtra","aloha","xylophone","and","holiday"};
		List<String> wordList = Arrays.asList(words);
		System.out.println(wordList);
		
		Collections.sort(wordList,new StringLengthComparator());
		
		System.out.println(wordList);
	}
	
	
	private static void sortListOfChemicalElements() {
		ChemicalElement o = new ChemicalElement(8,"Oxygen","O");
		ChemicalElement ga = new ChemicalElement(31,"Gallium","Ga");
		ChemicalElement h = new ChemicalElement(1,"Hydrogen","H");
		ChemicalElement k = new ChemicalElement(19,"Potassium","K");
		
		List<ChemicalElement> chems = new ArrayList<>();
		chems.add(o);chems.add(ga);chems.add(h);chems.add(k);
		
		System.out.println(chems);
		
		Collections.sort(chems);
		
		System.out.println(chems);
	}

	private static void sortListOfStrings() {
		String[] words = new String[]{"this","is","a","long","bunch","of","strange","words","like","zarathushtra","aloha","xylophone","and","holiday"};
		List<String> wordList = Arrays.asList(words);
		System.out.println(wordList);
		
		Collections.sort(wordList);
		
		System.out.println(wordList);
	}
	
	private static void sortArrayOfStrings() {
		String[] words = new String[]{"this","is","a","long","bunch","of","strange","words","like","zarathushtra","aloha","xylophone","and","holiday"};
		System.out.println(Arrays.toString(words));
		
		Arrays.sort(words);
		
		System.out.println(Arrays.toString(words));
	}

}
