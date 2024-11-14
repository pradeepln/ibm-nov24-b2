package com.ibm.training.basics;

public class ChemicalApp {

	public static void main(String[] args) {
		ChemicalElement o = new ChemicalElement(8,"Oxygen","O");
		ChemicalElement ga = new ChemicalElement(31,"Gallium","Ga");
		ChemicalElement h = new ChemicalElement(1,"Hydrogen","H");
		ChemicalElement k = new ChemicalElement(19,"Potassium","K");

		printDetails(o);
		printDetails(ga);
		printDetails(h);
		printDetails(k);
		
		
	}

	private static void printDetails(ChemicalElement c) {
		
		//c.atomicNumber = -1;
		
		System.out.println("_________________________________________");
		System.out.println("Name : "+c.getName()+", Symbol : "+c.getSymbol()+", Atomic# : "+c.getAtomicNumber());
		System.out.println("Is it a metal? "+c.isMetal());
		System.out.println("Is it a transition metal? "+c.isTransitionMetal());
		System.out.println("Is it an alkali metal? "+c.isAlkaliMetal());
	}

}
