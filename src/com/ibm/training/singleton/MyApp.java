package com.ibm.training.singleton;

public class MyApp {

	public static void main(String[] args) {
		//LegacyDbHelper helper = new LegacyDbHelper();

		LegacyDbHelper helper = LegacyDbHelper.getInstance();
		
		String data = helper.getDataFromDB();
		
		//LegacyDbHelper.instance = null;
	}

}



class SomeOtherModuleInSameApp{
	
	public void someOperation() {
		//LegacyDbHelper obj = new LegacyDbHelper();
		LegacyDbHelper obj = LegacyDbHelper.getInstance();
		
		obj.getDataFromDB();
	}
}