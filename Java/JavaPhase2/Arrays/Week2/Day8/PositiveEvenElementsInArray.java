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
		System.out.println("Positive and Even Elements of array are: ");
		for(int x: arr) {
			if(x>0 && x%2==0) {
				System.out.println(x);
			}
		}


		scn.close();
	}

}



Please enter size of array
5
Please enter elements of array
66
44
23
12
87
Positive and Even Elements of array are: 
66
44
12
