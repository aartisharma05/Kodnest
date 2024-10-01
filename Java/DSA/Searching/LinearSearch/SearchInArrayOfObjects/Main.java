package com.kodnest.dsa.searching;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : " );
		EmployeeFinding []arr = new EmployeeFinding[scn.nextInt()];
		
		System.out.println("Enter " + arr.length + " Elements of array: ");
		
		for(int i = 0; i<=arr.length-1;i++) {
			arr[i] = new EmployeeFinding(scn.nextInt(), scn.next());
		}
		
		System.out.println("Enter the key(name) to be find: ");
		
		String key = scn.next();
		
		int index = EmployeeFinding.EmployeeLinearSearch(arr, key);
		if(index>= 0) {
			System.out.println("KEY - " + key + " is found at INDEX - "+ index);
		}
		else {
			System.out.println("Key - " + key + " not found");
		}

	}

}
