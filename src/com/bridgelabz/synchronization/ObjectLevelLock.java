package com.bridgelabz.synchronization;

public class ObjectLevelLock {
	/*
	 * Object level synchronization apply only when one runnable object execute by
	 * one or more thread.
	 * 
	 */
	public static void main(String[] args) {

		ClassA a1 = new ClassA();                    // job
		
	
		Thread t1 = new Thread(a1);                 //thread 1

		t1.start();
        
		Thread t2 = new Thread(a1);              //thread 2

		t2.start();
		
		Thread t3 = new Thread(a1);             //thread 3

		t3.start();

	}

}
