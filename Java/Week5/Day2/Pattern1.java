package Patterns;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter number of lines to be printed: ");
		int lines = scn.nextInt()	;
		System.out.println("Enter number of $ symbol to be printed: ");
		int firstSymb = scn.nextInt()	;
		System.out.println("Enter number of * symbol to be printed: ");
		int secondSymb = scn.nextInt()	;
		
		
		for(int i=1;i<=lines;i++) {
			for(int j=1;j<=firstSymb;j++) {
				System.out.print("$");
			}
			
			for(int k=1;k<=secondSymb;k++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		scn.close();
	}

}



// O/p - 


// Enter number of lines to be printed: 
// 5
// Enter number of $ symbol to be printed: 
// 2
// Enter number of * symbol to be printed: 
// 3
// $$***
// $$***
// $$***
// $$***
// $$***
