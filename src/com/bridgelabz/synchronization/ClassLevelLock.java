package com.bridgelabz.synchronization;

public class ClassLevelLock {
	/*
	 * Class level synchronization apply only when more than one runnable object execute by
	 * one or more thread.
	 * 
	 */
	public static void main(String[] args) {

		ClassB a1 = new ClassB();                    // job1
		
		ClassB a2 = new ClassB();					// job2
		
		Thread t1 = new Thread(a1);                 //thread 1 execute job1

		t1.start();
        
		Thread t2 = new Thread(a1);              //thread 2  execute job1

		t2.start();
		
		Thread t3 = new Thread(a2);             //thread 3   execute job2

		t3.start();

	}

}
