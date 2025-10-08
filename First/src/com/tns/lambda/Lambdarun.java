package com.tns.lambda;

public class Lambdarun {

	public static void main(String[] args) {
			Runnable r = ()->{
			
			String str = Thread.currentThread().getName();
			System.out.println(str);	
		};
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();

	}

}
