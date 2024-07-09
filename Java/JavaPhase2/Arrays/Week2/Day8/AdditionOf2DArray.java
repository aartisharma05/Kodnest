package arrays;
import java.util.Scanner;
public class SumOf2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter no of rows n cols");
		
		int [][]arr = new int[scn.nextInt()][scn.nextInt()];
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				arr[i][j] = scn.nextInt();		
				}
		}
		
		
		int addition = 0;
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				addition+=arr[i][j];
				
				}
		}
		
		System.out.println("Addition of array elements is: " + addition);
		
		
		scn.close();
	}

}



// O/p-
//   Enter no of rows n cols
// 2
// 3
// 10
// 20
// 30
// 40
// 50
// 60
// Addition of array elements is: 210
