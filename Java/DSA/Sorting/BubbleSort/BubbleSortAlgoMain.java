package com.kodnest.dsa.sorting.bubbleSort;

import java.util.Scanner;

public class BubbleSortAlgoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length of array : ");
		int []arr = new int[scan.nextInt()];
		
		for(int i = 0;i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Sorted array using bubble sort");
		int []arr1 = BubbleSortAlgo.bubbleSortAlgo(arr);
		
		for(int x:arr1) {
			System.out.println(x);	
		}
		
		
		scan.close();
	}
	

}
