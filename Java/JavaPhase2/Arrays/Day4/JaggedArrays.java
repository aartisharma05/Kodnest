package arrays;
import java.util.*;
public class JaggedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of classes :");
		int [][]arr = new int[scn.nextInt()][];
	
		
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the number of columns in row :" + i);
			arr[i] = new int[scn.nextInt()];
		}
		
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter the age of class "+ (i+1) +" student " + (j+1));
				arr[i][j] = scn.nextInt();
			}
		}
		
		

		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				
				System.out.println("The age of class "+ (i+1) + " student " + (j+1) + " is: " +arr[i][j]);
			}
		}
		
		scn.close();

	}

}
