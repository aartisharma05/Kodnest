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
		

	}

}
