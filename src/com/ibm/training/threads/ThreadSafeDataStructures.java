package com.ibm.training.threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafeDataStructures {

	public static void main(String[] args) {
		
		//Vintage DS classes - thread-safe
		Vector<String> sV = new Vector<>();
		Hashtable<String, Integer> ht = new Hashtable<>();
		
		
		//Collections
		ArrayList<String> sList = new ArrayList<>(); //NOT thread-safe
		HashMap<String, Integer> hm = new HashMap<>(); //NOT thread-safe

		List<String> l = Collections.synchronizedList(new ArrayList<>()); //thread-safe
		Map<String,Integer> m = Collections.synchronizedMap(new HashMap<>()); //thread-safe
		
		
		//java.util.concurrent
		Map<String,Integer> chm = new ConcurrentHashMap<>(); // thread-safe
		
	}

}
