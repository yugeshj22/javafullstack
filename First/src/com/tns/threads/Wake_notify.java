package com.tns.threads;

public class Wake_notify extends  Thread{
	
	    public void run() {
	        synchronized (this) {
	            System.out.println(Thread.currentThread().getName() + " is waiting...");
	            try {
	                wait(); // Wake_notify goes into waiting state
	            } catch (InterruptedException e) {
	                System.out.println("Interrupted");
	            }
	            System.out.println(Thread.currentThread().getName() + " has been notified!");
	        }
	    }
	}

	class Geek extends Thread {
	   Wake_notify wn;

	    Geek(Wake_notify wn) {
	        this.wn = wn;
	    }

	    public void run() {
	        synchronized (wn) {
	            System.out.println(Thread.currentThread().getName() + " is notifying...");
	            wn.notify(); // Wakes up Wake_notify
	            System.out.println(Thread.currentThread().getName() + " has sent the signal.");
	        }
	    }
	}
