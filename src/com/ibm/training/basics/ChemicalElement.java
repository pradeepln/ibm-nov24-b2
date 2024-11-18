package com.ibm.training.basics;

public class ChemicalElement implements Comparable<ChemicalElement>{

	private int atomicNumber;
	private String name, symbol;

	private static boolean[] alkaliMetals = new boolean[120];
	
	static {
		alkaliMetals[3] = true;
		alkaliMetals[11] = true;
		alkaliMetals[19] = true;
		alkaliMetals[37] = true;
		alkaliMetals[55] = true;
		alkaliMetals[87] = true;
	}
	
	public ChemicalElement(int atomicNumber, String name, String symbol) {
		this.atomicNumber = atomicNumber;
		this.name = name;
		this.symbol = symbol;
	}

	public boolean isMetal() {
		switch (atomicNumber) {
		case 13, 49, 50, 81, 82, 83, 113, 114, 115, 116:
			return true;
		default:
			return false;
		}
	}

	public boolean isTransitionMetal() {
		return     (atomicNumber >= 21 && atomicNumber <= 31)
				|| (atomicNumber >= 39 && atomicNumber <= 48)
				|| (atomicNumber >= 72 && atomicNumber <= 80)
				|| (atomicNumber >= 104 && atomicNumber <= 112);
	}

	
	public boolean isAlkaliMetal() {
		return alkaliMetals[atomicNumber];
	}
	
	public int getAtomicNumber() {
		return atomicNumber;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber=" + atomicNumber + ", name=" + name + ", symbol=" + symbol + "]";
	}
	
	@Override
	public int compareTo(ChemicalElement other) {
		//System.out.println("Comparing "+this.symbol+" with "+other.symbol);
		
		return this.atomicNumber - other.atomicNumber;
		
		/*
		 * if(this.atomicNumber > other.atomicNumber) { return 1; }else
		 * if(other.atomicNumber > this.atomicNumber) { return -1; }else { return 0; }
		 */
	}
	
}
