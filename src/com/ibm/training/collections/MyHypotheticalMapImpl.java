package com.ibm.training.collections;

class Entry{
	Object key,value;

	public Entry(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}
	
}

public class MyHypotheticalMapImpl {

	Entry[] contents = new Entry[100];
	int end = -1;
	
	public void put(Object keyParam,Object valueParam) {
		
		for(Entry anEntry : contents) {
			if(anEntry.key.equals(keyParam)) {
				anEntry.value = valueParam;
				return;
			}
		}
		
		Entry newEntry = new Entry(keyParam,valueParam);
		contents[++end] = newEntry;
	}
	
	public Object get(Object keyParam) {
		for(Entry anEntry : contents) {
			if(anEntry.key.equals(keyParam)) {
				return anEntry.value;
			}
		}
		
		return null;
	}
}
