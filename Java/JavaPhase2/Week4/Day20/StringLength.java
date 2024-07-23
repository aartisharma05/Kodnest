package strings.kodnest.com;
import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		String s1 = scn.nextLine();
		String s2= scn.nextLine();
		
		scn.close();
		if(s1.length() == s2.length()) {
			System.out.println("Same length");
		}
		else System.out.println("Different length");


		// Without using in-built method
		 char []arr1 = s1.toCharArray();
	   
	        char []arr2 = s2.toCharArray();
	   
	  	 if(arr1.length == arr2.length) System.out.println("Same length");
	  	 else System.out.println("Different length");
	   
		

	}

}


// O/p-

// Enter two string: 
// JAVA
// JAVAPROGRAMMING
// Different length
