package com.tns.threads;

public class NotifyAll_main {
	public static void main(String[] args) throws InterruptedException {
        Object sharedLock = new Object();

        NotifyAllThread t1 = new NotifyAllThread(sharedLock);
        NotifyAllThread2 t2 = new NotifyAllThread2(sharedLock);
        NotifyAllNotifier t3 = new NotifyAllNotifier(sharedLock);


        t1.setName("NotifyAll-Thread");
        t2.setName("NotifyAll-Thread-2");
        t3.setName("NotifyAll-Notifier");

        t1.start();
        t2.start();

        Thread.sleep(100); // Ensure both threads are waiting

        t3.start();
    }

}
