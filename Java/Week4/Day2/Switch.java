package methods;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.println("Please enter the Day:");
		Scanner scn = new Scanner(System.in);
		int dayNo = scn.nextInt();
		
		switch(dayNo) {
		
		case 1: System.out.println("Day is Sunday");
		        break;
		        
		case 2: System.out.println("Day is Monday");
        break;
        
		case 3: System.out.println("Day is Tuesday");
        break;
        
		case 4: System.out.println("Day is Wednesday");
        break;
        
		case 5: System.out.println("Day is Thursday");
        break;
        
		case 6: System.out.println("Day is Friday");
        break;
        
		case 7: System.out.println("Day is Saturday");
        break;
        
		default: System.out.println("Your entered day is invalid");
        
		
		}
		
	
	
		
		scn.close();
	}

}
