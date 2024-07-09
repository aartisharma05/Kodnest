package algorithms;
import java.util.Scanner;
public class FindOccurances {
	
	
	static int findOccurances(int key, int arr[]) {
		 int count = 0;
	      for(int i=0;i<=arr.length-1;i++) {
	    	  if(key == arr[i]) {
	    		  count++;//counting the occurances of key
	    		  
	    	  }
	      }
	      return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scn = new Scanner(System.in);
      
      System.out.println("Enter size of array: ");
      int []arr = new int[scn.nextInt()];//enter the size of array
    		  
      System.out.println("Enter elements of array: ");
      for(int i=0;i<=arr.length-1;i++) {
    	  arr[i] = scn.nextInt();//enter the array elements
    	  }
      
      System.out.println("Enter key to be find occurances of: ");//Asking for key to be find the occurances of
      int key = scn.nextInt();
      
    
      
     System.out.println("Occurances of "+ key + " in array are: " + findOccurances(key, arr));//retrieve the occurances
	
	
	scn.close();
	
	}

}



// O/p-

//   Enter size of array: 
// 5
// Enter elements of array: 
// 11
// 22
// 11
// 22
// 11
// Enter key to be find occurances of: 
// 11
// Occurances of 11 in array are: 3

