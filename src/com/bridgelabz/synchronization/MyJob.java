package com.bridgelabz.synchronization;

public class MyJob implements Runnable{

	@Override
	public void run() {
		
		 
		
		disp();
		
	}

	private void disp() {
		
		
		synchronized (this) {
			System.out.println("START --> "+Thread.currentThread().getName());
			
			 for (int i = 0; i < 10; i++) {
					
					System.out.println(" i ->"+i);
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
		}
			 System.out.println("END --> "+Thread.currentThread().getName());	
}
		 
			
		
	}

}
