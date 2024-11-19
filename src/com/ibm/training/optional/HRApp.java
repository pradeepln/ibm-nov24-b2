package com.ibm.training.optional;

import java.util.Optional;

import com.ibm.training.basics.Employee;

public class HRApp {

	public static void main(String[] args) {
		
		int idFromUi = 10;
		
//		Optional<Employee> opt =  DBHelper.findEmployee(idFromUi);
//		
//		if(opt.isPresent()) {
//			Employee e = opt.get();
//			System.out.println("Id: "+e.getId());
//			System.out.println("Name: "+e.getName());
//		}else {
//			System.out.println("Id: 0");
//			System.out.println("Name: Not Found");
//		}
		
		Employee defaultDisplayObj = new Employee(0, "Not Found");
		
		Employee e = DBHelper.findEmployee(idFromUi).orElse(defaultDisplayObj);
		
		System.out.println("Id: "+e.getId());
		System.out.println("Name: "+e.getName());
		
	}

}
