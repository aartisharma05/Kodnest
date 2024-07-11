package com.kodnest.practice;

import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		  Scanner scn = new Scanner(System.in);
	       
			System.out.println("How many Even numbers sum you need: ");
			int n = scn.nextInt();
			int sum = 0;
			for(int i=1;i<=2*n;i++) {
				if(i%2==0) {
					sum = sum+i;
					
				}
			}
			System.out.print("Sum is "+sum);
			scn.close();
			
	}

}



// How many Even numbers sum you need: 
// 5
// Sum is 30
