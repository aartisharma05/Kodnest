package arrays;
import java.util.Scanner;
public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		String []arr = new String[2];
        
		System.out.println("Please enter elements of array you want to swap");
		
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = scn.nextLine();
		}
		System.out.println("Elements of array before swapping: ");
		for(String x: arr) {
				System.out.println(x);
		}
        
		String temp = arr[0];
		
		arr[0]=arr[1];
		arr[1] = temp;
		
		System.out.println("Elements of array before swapping: ");
		for(String x: arr) {
			System.out.println(x);
	}
		scn.close();
	}

}




// O/p- 
// Please enter elements of array you want to swap
// aarti
// deepthi
// Elements of array before swapping: 
// aarti
// deepthi
// Elements of array before swapping: 
// deepthi
// aarti
