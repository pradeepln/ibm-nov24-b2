package com.ibm.training.basics;

public class Employee{
	int id;
	String name;
	
	public Employee(int id,String name) {
		super();
		System.out.println("In Employee Constructor");
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}