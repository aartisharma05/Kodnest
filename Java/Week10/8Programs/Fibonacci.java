package com.kodnest.practice.Fibonacci;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		 System.out.println("Enter an ending number of series: ");
		int n = scn.nextInt();
		
		int a = 0;
		int b = 1;
		
		System.out.println("Fabonacci series is: ");
		if( n == 1) {
			System.out.println(a);
		}
		if( n == 2) {
			System.out.println(a + " " + b);
		}
		 
		if(n>2) {
			System.out.print(a + " ");
			System.out.print(b + " ");
			
			for(int i = 2;i<=n;i++) {
				int c = a+b;
				System.out.print(c + " ");
				a = b;
				b = c;
				
			}
		}
		
		
		scn.close();
	

	}

}
