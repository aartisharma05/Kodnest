package com.kodnest.practice;
import java.util.Scanner;
public class EvenNumberOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn = new Scanner(System.in);
       
		System.out.println("How many Even numbers do you want me to print: ");
		int n = scn.nextInt();
		
		for(int i=1;i<=2*n;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		
		scn.close();
	}

}


// How many Even numbers do you want me to print: 
// 5
// 2 4 6 8 10 
