package com.ibm.training.basics;
//					is a
public class Car extends Vehicle {
	
	@Override
	public void start() {
		System.out.println("<<<<<< STarting Car, Checking all instruments >>>>>>");
	}
	
	@Override
	public void stop() {
		System.out.println("<<<<<< Stopping Car, Shutting down all instruments >>>>>>");
	}
	
	
	public void playMusic() {
		System.out.println("<<<<<< La la la >>>>>>");
	}

}
