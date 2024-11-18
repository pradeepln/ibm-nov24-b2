package com.ibm.training.lambdas;

import java.util.Arrays;

public class LambdaDemo {

	int s1;
	static int s2;
	int instI = 12;
	static int statI = 43;
	
	public static void main(String[] args) {
		String[] words = new String[]{"this","is","a","long","bunch","of","strange","words","like","zarathushtra","aloha","xylophone","and","holiday"};
		
		
		//Arrays.sort(words,(String s1, String s2) -> {return s1.length() - s2.length();});
		
		//Arrays.sort(words,(s1,s2) -> {return s1.length() - s2.length();});
		
		//Arrays.sort(words,(s1,s2) -> s1.length() - s2.length());
		
		//Arrays.sort(words,(s1,s2) -> s2.length() - s1.length());
		
		//Arrays.sort(words,(s1,s2) -> s1.charAt(0) - s2.charAt(0));
		
		//Arrays.sort(words,(s1,s2) -> s1.substring(0, 1).compareTo(s2.substring(0, 1)) );
	
		//System.out.println(instI);
//		System.out.println(statI);
//		
//		int localI = 42;
//		
//		int x = 34;
				
//		Arrays.sort(words, (s1,s2) -> {
//			if(s1.contains("e") && !s2.contains("e")) {
//				return -1;
//			}else if(!s1.contains("e") && s2.contains("e")) {
//				return 1;
//			}else {
//				return 0;
//			}
//		});
		
//arity                     in       out	
		//Arrays.sort(words,(s1,s2) -> wordsWithEFirst(s1, s2));
		
//		LambdaDemo obj = new LambdaDemo();
//		Arrays.sort(words,obj::wordsWithEFirst);
		
		Arrays.sort(words,LambdaDemo::wordsWithEFirst);
		
		System.out.println(Arrays.toString(words));
	}


//a               ret                    args
//s accSp   mod   ret       name         args
	public static int wordsWithEFirst(String s1,String s2){
		if(s1.contains("e") && !s2.contains("e")) {
			return -1;
		}else if(!s1.contains("e") && s2.contains("e")) {
			return 1;
		}else {
			return 0;
		}
	}
}
