package org.someother;

import com.ibm.training.basics.Car;
import com.ibm.training.basics.DOWFinder;
import com.ibm.training.basics.Driver;
import com.ibm.training.basics.Point;
//import com.ibm.training.basics.Employee;

//import com.ibm.training.basics.*;

public class UserOfComIbm {

	public static void main(String[] args) {
		//Use FQN
		//com.ibm.training.basics.Car c = new com.ibm.training.basics.Car();
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		DOWFinder df;
		Driver carDriver;
		java.sql.Driver dbDriver;
		
		//Employee e;
		
		Point p = new Point(17, 71);
		
		//System.out.println(p.x);
		//liberal ---------------------------------------> restrictive
		//public 		protected		default			private
	}

}
