package com.ibm.training.wrappers;

public class WrapperDemo {
	
	
	public static void methodWithPrimitiveParam(int i) {
		System.out.println("Primitive "+i);
	}

	public static void main(String[] args) {
		int k = 71;
		methodWithPrimitiveParam(10);
		methodWithPrimitiveParam(k);
		
		//methodWithPrimitiveParam("88");
		//methodWithPrimitiveParam(new Object());
		
		Integer iObj = new Integer(123);
		
		methodWithPrimitiveParam(iObj); //auto-unboxing methodWithPrimitiveParam(iObj.intValue());
	}

}
