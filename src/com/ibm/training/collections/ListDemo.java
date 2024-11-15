package com.ibm.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		//simpleRawListOps();
		
		//genericListOps();
		
		linkedListOps();
	}
	
	public static void someAlgo(List<String> l) {
		
		//complex stuff
		String aVal = l.get(1);
		
		//complex stuff
		
		l.add(0, "new computed first");
		
		//complex stuff]
		
		l.remove(1);
		
		int size = l.size();
		
		System.out.println("_________ loop 1 ___________");
		for(int i = 0; i < size; i++) {
			String aValue = l.get(i);
			System.out.println(aValue);
		}
		
		System.out.println("_________ loop 2 ___________");
		Iterator<String> it = l.iterator();
		
		while(it.hasNext()) {
			String aValue = it.next();
			System.out.println(aValue);
			if(aValue.startsWith("o")) {
				it.remove();
			}
		}
		
		System.out.println("_________ loop 3 ___________");
		
		for(String aValue : l) {
			System.out.println(aValue);
		}
	}

	private static void linkedListOps() {
		LinkedList<String> l = new LinkedList<>();
		
		l.add("hello");
		l.add("from");
		l.add("other");
		
		l.add(2, "the");
		
		l.addLast("side");
		
		System.out.println(l);
		
		l.removeFirst();
		
		System.out.println(l);
		
		l.offer("first");
		
		System.out.println(l);
		
		System.out.println(l.peek());
		
		someAlgo(l);
	}

	private static void genericListOps() {
		List<String> sList = new ArrayList<String>();
		List<Integer> iList = new ArrayList<>();
		
		sList.add("hello");
		
		iList.add(123);
		
		//iList.add("234");
		
		String sValue = sList.get(0);
		
		int iValue = iList.get(0);
		
		someAlgo(sList);
	}

	private static void simpleRawListOps() {
		ArrayList al = new ArrayList();

		al.add("first");
		al.add("second");
		al.add("fourth");

		System.out.println(al);

		al.add(2, "third");

		System.out.println(al);

		al.add(0, "real first");

		System.out.println(al);

		String val = (String) al.get(3);

		System.out.println(val);

		al.remove(0);

		System.out.println(al);

		val = (String) al.get(3);

		System.out.println(val);
		
		//al.add(new Car());
		
		System.out.println("___________ loop ___________");
		for(int i = 0; i < al.size(); i++) {
			String s = (String) al.get(i);
			System.out.println(s);
		}
	}

}
