package com.kodnest.multithreading.Deadlock;

public class Warrior implements Runnable{

	String astra1 = "Sarpastra";
	String astra2 = "Brahmastra";
	String astra3 = "Pushpastra";

	public void run() {
		if(Thread.currentThread().getName().equals("Karna")) {
			karnaAcquireResource();
		}
		else {
            arjunaAcquireResource();
		}
	}


	void karnaAcquireResource() {
		try {

			Thread.sleep(5000);
			synchronized (astra1) {
				System.out.println(Thread.currentThread().getName() + " HAS ACQUIRED ASTRA-1 " + astra1);
				Thread.sleep(5000);
				synchronized (astra2) {
					System.out.println(Thread.currentThread().getName() + " HAS ACQUIRED ASTRA-2 " + astra2);
					Thread.sleep(5000);
					synchronized (astra3) {
						System.out.println(Thread.currentThread().getName() + " HAS ACQUIRED ASTRA-3 " + astra3);
						Thread.sleep(5000);
					}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	void arjunaAcquireResource() {
		try {

			Thread.sleep(5000);
			synchronized (astra3) {
				System.out.println(Thread.currentThread().getName() + " HAS ACQUIRED ASTRA-3 " + astra3);
				Thread.sleep(5000);
				synchronized (astra2) {
					System.out.println(Thread.currentThread().getName() + " HAS ACQUIRED ASTRA-2 " + astra2);
					Thread.sleep(5000);
					synchronized (astra1) {
						System.out.println(Thread.currentThread().getName() + " HAS ACQUIRED ASTRA-1 " + astra1);
						Thread.sleep(5000);
					}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
