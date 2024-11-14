package com.ibm.training.basics;

public class MyDS {
	
	public void addElement(Object anelement) {
		
	}
	
	public void removeElement(Object elementToBeRemoved) {
		
	}

}


class ClientOfMyDS{
	
	public static void main(String[] args) {
		MyDS ds = new MyDS();
		
		ds.addElement("hhhh");
		ds.addElement(new Car());
	}
}