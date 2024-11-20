package com.ibm.training.threads;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		//byExtendingThreadClass();
		byImplementingRunnable();
	}

	private static void byImplementingRunnable() throws InterruptedException {
		
		PrimeCounterTask task1 = new PrimeCounterTask(1, 140_000);
		PrimeCounterTask task2 = new PrimeCounterTask(140_001, 200_000);
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();t2.start();
		
		t1.join();t2.join();
		
		int total = task1.getCount() + task2.getCount();
		
		System.out.println("Primes: "+total);
	}

	private static void byExtendingThreadClass() throws InterruptedException {
		long startTime = System.currentTimeMillis();
		System.out.println("Program starting in "+Thread.currentThread().getName());
		
		PrimeCounterThread t1 = new PrimeCounterThread(1, 130_000);
		PrimeCounterThread t2 = new PrimeCounterThread(130_001, 200_000);
		
		t1.start();
		t2.start();
		
		/*
		 * while(t1.isAlive()) { Thread.sleep(250); }
		 */
		
		t1.join();
		t2.join();
		
		int totalPrimes = t1.getCount() + t2.getCount();
				
		System.out.println("There are totally "+totalPrimes+" prime numbers b/w 1 and 200k");
		long stopTime = System.currentTimeMillis();
		System.out.println("Time taken : "+(stopTime - startTime)+" ms.");
	}

}
