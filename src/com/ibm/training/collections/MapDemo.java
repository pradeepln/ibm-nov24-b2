package com.ibm.training.collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo {

	public static void main(String[] args) {
		mapOps();

	}

	private static void mapOps() {
//		Map<String,Integer> runsMap = new HashMap<>();
		
		Map<String,Integer> runsMap = new LinkedHashMap<>();
		
		runsMap.put("rohit", 10);
		runsMap.put("virat", 14);
		runsMap.put("sachin", 199);
		runsMap.put("ashwin", 79);
		runsMap.put("bumrah", 56);
		
		Scanner kb = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("Enter a batsman name (or 'quit'): ");
			String inputKey = kb.nextLine();
			if(inputKey.equalsIgnoreCase("quit")) {
				System.out.println("Bye!");
				break;
			}
			
			if(runsMap.containsKey(inputKey)) {
				System.out.println(inputKey + " -------------> " + runsMap.get(inputKey));
			}else {
				System.out.println("No data for "+inputKey);
			}
		}
		System.out.println("_____________ Whole Map ______________");
		
		Collection<String> allKeys = runsMap.keySet();
		for(String aKey : allKeys) {
			System.out.println(aKey+" -----------> "+runsMap.get(aKey));
		}
		
//		System.out.println("Anyone with exactly 199? "+(runsMap.containsValue(199)));
//		System.out.println("Anyone with exactly 200? "+(runsMap.containsValue(200)));
//		
//		runsMap.put("sachin", 200);
//		
//		allKeys = runsMap.keySet();
//		for(String aKey : allKeys) {
//			System.out.println(aKey+" -----------> "+runsMap.get(aKey));
//		}
	}

}
