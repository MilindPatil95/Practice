package com.bridgelabz.synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolImplementation {
	
	public static void main(String[] args) {
		
		MyJob job = new MyJob();
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		for (int i = 0; i < 6; i++) {
		
			service.execute(job);
		}
		
		service.shutdown();
	}

}
