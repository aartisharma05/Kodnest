package practiceDay3;

import java.util.Scanner;

public class Fibonacci {
	
	public static void fibonacci(int n) {
		
		int a = 0;
		int b =1;
		System.out.print(a + " ");
		System.out.print(b + " ");
	    int c =0;
		for(int i = 2;i<n;i++) {
			c = a+b;
			System.out.print(c + " ");
			a = b;
			b = c;
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		
		fibonacci(num);
		scn.close();

	}

}
