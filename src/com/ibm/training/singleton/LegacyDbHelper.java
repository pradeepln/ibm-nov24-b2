package com.ibm.training.singleton;

import java.sql.Connection;

public class LegacyDbHelper {
	
	private static LegacyDbHelper instance; // = new LegacyDbHelper();
	
	//assume this connection is very expensive
	Connection connection;
	
	private LegacyDbHelper() {
		// establish connection to back end db....
	}
	
	public String getDataFromDB() {
		//use the connection and query data..
		return "data from db";
	}
	
	public static LegacyDbHelper getInstance() {
		if(instance == null) {
			instance = new LegacyDbHelper();
		}
		return instance;
	}

}
