package com.tns.threads;

public class Joinmain {

	public static void main(String[] args) throws InterruptedException {
		Join j1 = new Join();
		Join j2 = new Join();
		j1.start();
		
		j1.join();
		
		j2.start();
	}

}
