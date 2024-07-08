// WAP to print the character entered by user , take input for rows and cols also from user

package loops;
import java.util.Scanner;
public class PatternProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = scn.nextInt();      
		System.out.println("Enter number of cols: ");
		int cols = scn.nextInt();		
		System.out.println("Enter character: ");
		char ch = scn.next().charAt(0);
				for(int i=1;i<=rows;i++) {
					for(int j=1;j<=cols;j++) {
						System.out.print(ch);
					}
					System.out.println();
				}
				scn.close();
	}
	

}
