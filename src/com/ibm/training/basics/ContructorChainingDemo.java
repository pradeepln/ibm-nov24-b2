package com.ibm.training.basics;
import java.sql.Connection;
import java.sql.DriverManager;

public class ContructorChainingDemo {

	public static void main(String[] args) {
		
//		Manager mgr = new Manager(1, "mgr", "eng");
		Manager mgr = new Manager(1, "mgr");
	}

}


class Employee{
	int id;
	String name;
	
	public Employee(int id,String name) {
		super();
		System.out.println("In Employee Constructor");
		this.id = id;
		this.name = name;
	}
}


class Manager extends Employee{
	String dept;
	
	public Manager(int id,String name,String dept) {
		super(id,name);
		System.out.println("In Manager 3 arg constructor");
	}
	
	public Manager(int id,String name) {
		this(id,name,"TBD");
		System.out.println("In Manager 2 arg constructor");
	}
	
}



class DBHelper{
	Connection c;
	
	public DBHelper(String user,String password) {
		//this.c = DriverManager.getConnection("", user, password);
		//establish connection using username and password
	}
	
	public String getDataFromDB() {
		//will query the db using the connection already established in constructor
		return "data from db";
	}
}


class SpecialDBHelper extends DBHelper{
	
	public SpecialDBHelper(String user,String password) {
		super(user,password);
		String data = super.getDataFromDB();
	}
	
}

