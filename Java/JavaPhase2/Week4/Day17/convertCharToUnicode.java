package strings.kodnest.com;
import java.util.Scanner;
public class CharUnicodeValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scn = new Scanner(System.in);
		 
		 System.out.println("Please enter a character: ");
		  char ch = scn.next().charAt(0);
		  
		  int value = (int) ch;
		  
		  System.out.println("unicode value of "+ ch +" is : "+ value );
		  
		  scn.close();
	}

}
