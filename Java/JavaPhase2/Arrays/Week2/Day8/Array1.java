package arrays;
import java.util.Scanner;
public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter size of array");

		int []arr = new int[scn.nextInt()];
        
		System.out.println("Please enter elements of array");
		
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = scn.nextInt();
		}

		
		System.out.println("Elements of array are: ");
		for(int x: arr) {
			System.out.println(x+5);
		}


		scn.close();
	}

}





// Please enter size of array
// 5
// Please enter elements of array
// 10
// 20
// 30
// 40
// 50
// Elements of array are: 
// 15
// 25
// 35
// 45
// 55

