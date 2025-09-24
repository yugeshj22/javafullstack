package com.tns.threads;

public class Join extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+"Started");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e){
			System.out.println(e);
		}
		 System.out.println(Thread.currentThread().getName() + " finished.");
	}
}
