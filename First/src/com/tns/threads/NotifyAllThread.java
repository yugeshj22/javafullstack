package com.tns.threads;

public class NotifyAllThread extends Thread{
	Object lock;

    NotifyAllThread(Object lock) {
        this.lock = lock;
    }

    public void run() {
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " is waiting...");
            try {
                lock.wait(); // Goes into waiting state
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
            System.out.println(Thread.currentThread().getName() + " has been notified!");
        }
    }
}

class NotifyAllThread2 extends Thread {
    Object lock;

    NotifyAllThread2(Object lock) {
        this.lock = lock;
    }

    public void run() {
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " is waiting...");
            try {
                lock.wait(); // Goes into waiting state
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
            System.out.println(Thread.currentThread().getName() + " has been notified!");
        }
    }
}

class NotifyAllNotifier extends Thread {
    Object lock;

    NotifyAllNotifier(Object lock) {
        this.lock = lock;
    }

    public void run() {
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " is notifying all...");
            lock.notifyAll(); // Wakes up all threads waiting on lock
            System.out.println(Thread.currentThread().getName() + " has sent the signal.");
        }
    }
}