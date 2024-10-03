package com.kodnest.dsa.searching;

import java.util.Scanner;

public class BinarySearchAlgoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the array length: ");
		int []arr= new int[scan.nextInt()];
		System.out.println("Enter  "+ arr.length + " elements in the array");
		for(int i = 0;i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Enter the key to be searched: ");
		int key = scan.nextInt();
		
		
		int index = BinarySearchAlgo.binarySearchAlgo(arr, key);
		
		
		if(index == -1) {
			System.out.println("Key not found");
		}
		else {
			System.out.println("Key found at index : " + index);
		}
		
		scan.close();
	}

	
}
