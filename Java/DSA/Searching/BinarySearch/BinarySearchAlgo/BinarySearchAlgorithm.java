package com.kodnest.dsa.searching;
//import java.lang.Math;

public class BinarySearchAlgo {

	public static int binarySearchAlgo(int []arr, int key) {
		int low = 0;
		int high = arr.length-1;
		int mid = 0;
		while(low<=high) {
			 mid = (low+high)/2;
			if(key == arr[mid]) {
				return mid;
			}
			else if(key>arr[mid]) {
				low = mid+1;
			}
			else {
				high = mid -1;
			}
		}
		
		return -1;
	}
	
	
}
