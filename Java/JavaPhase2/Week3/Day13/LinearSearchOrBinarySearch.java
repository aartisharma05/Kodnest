package algorithms;
import java.util.Scanner;
import java.util.Arrays;

class Searching{

	
	 void linearSearch(int key, int []arr){
		
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i] == key) {
				System.out.println("Key is found");
				return;
			}
		}
		System.out.println("Key not found");
		
	}
	
	
     void BinarySearch(int key, int []arr){
		
    	mySort(arr);
    	int low = 0, high = arr.length-1;
    	
    	while(low<=high) {
    		int mid = (low+high)/2;
    		
    		if(key == arr[mid]) {
    			System.out.println("Key is found");
    			return;
    		}
    		else if(key>arr[mid]) {
    			low = mid+1;
    		}
    		else {
    			high = mid-1;
    		}
    		
    	}
    	
    	System.out.println("Key not found");
	}

    
    int[] mySort(int []arr) {
    	Arrays.sort(arr);
    	return arr;
    }


}
public class LinearOrBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int []arr = new int[scn.nextInt()];
		
		System.out.println("Enter the elements of array");
		for(int i =0;i<=arr.length-1;i++) {
			arr[i] = scn.nextInt();
		}
		
		System.out.println("Enter the key you want to find in array");
		
		int key = scn.nextInt();
		
		System.out.println("Enter 1 for Linear Search and 2 for Binary Search");
		int option = scn.nextInt();
		
		
		
		
		if(option == 1) {
			Searching.linearSearch(key, arr);
		}
		else if(option == 2) {
			Searching.BinarySearch(key, arr);
		}
		else {
			System.out.println("Please enter correct option(Choose either 1 or 2");
		}
		
		
       scn.close();
	}

}


// O/p-

// Enter the size of array
// 5
// Enter the elements of array
// 10
// 50
// 40
// 60
// 80
// Enter the key you want to find in array
// 70
// Enter 1 for Linear Search and 2 for Binary Search
// 2
// Key not found
