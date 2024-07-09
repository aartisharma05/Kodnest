package arrays;
import java.util.Scanner;
public class CopyingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
     System.out.println("Please enter the size of the array");
     int []arr = new int[scn.nextInt()];
     int []copiedArray = new int[arr.length];
     
     for(int i=0;i<=arr.length-1;i++) {
    	 arr[i] = scn.nextInt();
    	 }
     
//     copying elements from arr to copiedArray
     for(int i=0;i<=arr.length-1;i++) {
    	 copiedArray[i] = arr[i];
    	 }
     
     
     System.out.println("The elements of original array are: ");
     for(int x:arr) {
    	 System.out.println(x);
    	 }
     
     System.out.println("The elements of copied array are: ");
     for(int x:copiedArray) {
    	 System.out.println(x);
    	 }
	}

}



// O/p- 

// Please enter the size of the array
// 4
// 55
// 66
// 77
// 88
// The elements of original array are: 
// 55
// 66
// 77
// 88
// The elements of copied array are: 
// 55
// 66
// 77
// 88
