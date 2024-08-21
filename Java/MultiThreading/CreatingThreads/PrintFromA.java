package com.kodnest.multithreading.creatingThread.scenerio1;

import java.util.Scanner;

public class PrintFromA implements Runnable{
 
	   @Override
	   public void run() {
	   	   
	   	   Scanner scn = new Scanner(System.in);
	   	  
	   	   for(char ch = 'A'; ch<='L'; ch++) {
	   		   System.out.println(ch );
	   	   } 
}
}
