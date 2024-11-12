package com.kodnest.multithreading.Deadlock;


public class WarriorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Warrior warrior = new Warrior();
		
		Thread t1 = new Thread(warrior);
		Thread t2 = new Thread(warrior);
		
		t1.setName("Karna");
		t2.setName("Arjuna");
		
		// Deadlock -  Thread "Karna" is waiting for resource 3 (i.e. astra 3 which is locked by "Arjuna" ) and Thread "Arjuna" is waiting for resource-1 (i.e. 
		// astra 1 which is locked by "Karna")
		t1.start();
		t2.start();
	}

}
