package com.ibm.training.lambdas;

public class UseLambdaForMyFunc {

	public static void main(String[] args) {
		UserOfMyFunc u = new UserOfMyFunc();
		
		u.selectAll(s -> {
			System.out.println("My Lambda Called!!!");
			return s.length() > 3;
			});
		
		

	}

}
