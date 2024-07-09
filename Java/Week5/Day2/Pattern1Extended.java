package Patterns;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter number of lines to be printed: ");
		int lines = scn.nextInt()	;
		System.out.println("Enter number of first symbol to be printed and symbol: ");
		int firstSymb = scn.nextInt()	;
		char firstSymbol = scn.next().charAt(0);
		System.out.println("Enter number of second symbol to be printed and symbol: ");
		int secondSymb = scn.nextInt()	;
		char secondSymbol = scn.next().charAt(0);
		
		
		for(int i=1;i<=lines;i++) {
			for(int j=1;j<=firstSymb;j++) {
				System.out.print(firstSymbol);
			}
			
			for(int k=1;k<=secondSymb;k++) {
				System.out.print(secondSymbol);
			}
			
			System.out.println();
			
		}
		
		scn.close();
	}

}



// O/p-


// Enter number of lines to be printed: 
// 5
// Enter number of first symbol to be printed and symbol: 
// 3
// )
// Enter number of second symbol to be printed and symbol: 
// 3
// (
// )))(((
// )))(((
// )))(((
// )))(((
// )))(((
