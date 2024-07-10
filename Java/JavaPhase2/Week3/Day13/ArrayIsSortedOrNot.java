package algorithms;
import java.util.Arrays;
import java.util.Scanner;



public class ArraySortedOrNot {

	
    static boolean isSorted(int []arr) {
    	for(int i=0;i<=arr.length-2;i++) {
    		if(arr[i]>arr[i+1]) return false;
    	}

    	return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the size of array: ");
		int []arr = new int[scn.nextInt()];
		
		System.out.println("Please enter the elements of array");
		
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = scn.nextInt();
		}
		
		if(isSorted(arr) == true) System.out.println("Array is Sorted");
		else System.out.println("Array is not Sorted");
		
		
		scn.close();
	
	}

}




// O/p - 

//   Please enter the size of array: 
// 5
// Please enter the elements of array
// 2
// 9
// 1
// 6
// 2
// Array is not Sorted
