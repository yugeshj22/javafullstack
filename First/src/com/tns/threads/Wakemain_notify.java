package com.tns.threads;

public class Wakemain_notify {
	public static void main(String[] args) throws InterruptedException {
        Wake_notify g = new Wake_notify();
        Geek g2 = new Geek(g);

        Thread t1 = new Thread(g, "Wake_notify-Thread");
        Thread t2 = new Thread(g2, "Geek-Thread");

        t1.start();
        Thread.sleep(100); // Ensure Geek1 starts and waits
        t2.start();
    }

}
