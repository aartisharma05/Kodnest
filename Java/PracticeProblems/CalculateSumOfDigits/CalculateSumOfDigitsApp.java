package practiceDay2;

import java.util.Scanner;

public class CalculateSumOfDigitsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		CalculateSumOfDigits sOD = new CalculateSumOfDigits();
		int n = scn.nextInt();
	
		while(n>=10) {
			 n = sOD.sumOfDigits(n);
        
		}
	    System.out.println(n);
		
	
		
		scn.close();
	}

}
