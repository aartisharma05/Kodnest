package com.kodnest.multithreading.creatingThread.scenerio1;

public class PrintTableApp {
public static void main(String[] args) {
	PrintTable t1 = new PrintTable();
	PrintFromA printA = new PrintFromA();
	
	Thread t2 = new Thread(printA);
	
	t1.start();
	t2.start();
	
}
}
