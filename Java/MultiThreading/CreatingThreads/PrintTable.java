package com.kodnest.multithreading.creatingThread.scenerio1;

import java.util.Scanner;

public class PrintTable extends Thread {
   @Override
public void run() {
	   System.out.println("Table printing started");
	   Scanner scn = new Scanner(System.in);
	   System.out.println("Enter a number");
	   int num = scn.nextInt();
	   for(int i = 1; i<=10; i++) {
		   System.out.println(i*num );
	   }
   }
   
}
