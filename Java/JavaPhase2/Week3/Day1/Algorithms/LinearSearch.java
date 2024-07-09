package algorithms;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int []arr = new int[scn.nextInt()];
		
		
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = scn.nextInt();
			
		}
		System.out.println("Enter the key you want to search in array: ");
		int key = scn.nextInt();
		
		
//		Linear Search Algorithm
		
		for(int i=0;i<= arr.length-1;i++) {
			if(arr[i]==key) {
				System.out.println("Key found");
				System.exit(0);
			}
			
			
		}
		
		System.out.println("Key not found");
		
		
		
	}

}







// O/p-

//   Enter the size of array: 
// 5
// Enter the elements of array: 
// 11
// 22
// 33
// 44
// 55
// Enter the key you want to search in array: 
// 30
// Key not found
