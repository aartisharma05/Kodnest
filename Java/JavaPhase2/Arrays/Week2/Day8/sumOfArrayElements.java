package arrays;
import java.util.Scanner;
public class SumOfElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        
       
        System.out.println("Enter size of array");
        int n = scn.nextInt();
    
        int []arr = new int[n]; 
        
        System.out.println("Enter elements of array");
        for(int i=0;i<=n-1;i++) {
        	arr[i]=scn.nextInt();
        	
        }
        
        int sum = 0;
        for(int x: arr) {
        	sum += x;
        }
        
        
        System.out.println("Sum of elements in array is: "+sum);
        
        scn.close();
        
	}

}




// O/p- 
// Enter size of array
// 5
// Enter elements of array
// 10
// 20
// 30
// 40
// 50
// Sum of elements in array is: 150

