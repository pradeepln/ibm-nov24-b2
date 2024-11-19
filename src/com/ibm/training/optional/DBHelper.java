package com.ibm.training.optional;

import java.util.Optional;

import com.ibm.training.basics.Employee;

public class DBHelper {

	
	public static Optional<Employee> findEmployee(int empId) {
		
		//select * from employee where emp_id=empId
		boolean found = false;
		
		if(found) {
			return Optional.of(new Employee(empId, "whatever data from db"));
		}else {
			return Optional.empty();
		}
		
	}
}
