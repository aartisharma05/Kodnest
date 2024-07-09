package arrays;
import java.util.Scanner;
public class SumOfElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        
       
        System.out.println("Enter size of array");
        int n = scn.nextInt();
        
        
        int []firstArr = new int[n]; 
        int []secondArr = new int[n]; 
        int []thirdArr = new int[n]; 
        
        
        
        System.out.println("Enter elements of first array");
        for(int i=0;i<=n-1;i++) {
        	firstArr[i]=scn.nextInt();
        	
        }
        
        System.out.println("Enter elements of second array");
        for(int i=0;i<=n-1;i++) {
        	secondArr[i]=scn.nextInt();
        	
        }
        
        
        for(int i=0;i<=n-1;i++) {
        	thirdArr[i] = firstArr[i]+secondArr[i];
        }
        
        
        System.out.println("Elements of first array are: ");
        
        for(int x: firstArr) {
        	System.out.println(x);
        }
        
        System.out.println("Elements of second array are: ");
        
        for(int y: secondArr) {
        	System.out.println(y);
        }
        
        System.out.println("Elements of third array are: ");
       
        for(int z: thirdArr) {
        	System.out.println(z);
        }
        
        int firstSum = 0, secondSum =0,thirdSum=0;
        float firstAvg = 0.0f, secondAvg = 0.0f, thirdAvg = 0.0f;
       
        
        for(int x: firstArr) {
        	firstSum+=x;
        }
        
        firstAvg = firstSum/n;
        
        System.out.println("Avg of first array is: "+firstAvg);
        
        
        for(int x: secondArr) {
        	secondSum+=x;
        }
        
        secondAvg = secondSum/n;
        
        System.out.println("Avg of first array is: "+secondAvg);
        
        for(int x: thirdArr) {
        	thirdSum+=x;
        }
        
        thirdAvg = thirdSum/n;
        
        System.out.println("Avg of first array is: "+thirdAvg);
        
        
        scn.close();
        
	}

}




// O/p-

// Enter size of array
// 5
// Enter elements of first array
// 88
// 77
// 66
// 45
// 24
// Enter elements of second array
// 36
// 91
// 72
// 64
// 82
// Elements of first array are: 
// 88
// 77
// 66
// 45
// 24
// Elements of second array are: 
// 36
// 91
// 72
// 64
// 82
// Elements of third array are: 
// 124
// 168
// 138
// 109
// 106
// Avg of first array is: 60.0
// Avg of first array is: 69.0
// Avg of first array is: 129.0
