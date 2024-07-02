package methods;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.println("Please enter the Day:");
		Scanner scn = new Scanner(System.in);
		int day = scn.nextInt();
		
		
		if(day==1){   
			System.out.println("Day is Sunday");
		}
		
		else if(day==2){
			System.out.println("Day is Monday");
		}
		
		else if(day==3){
			System.out.println("Day is Tuesday");
		}
		
		else if(day==4){
			System.out.println("Day is Wednesday");
		}
		
		else if(day==5){
			System.out.println("Day is Thursday");
		}
		else if(day==6){
			System.out.println("Day is Friday");
		}
		else if(day==7){
			System.out.println("Day is Saturday");
		}
		else {
			System.out.println("Your entered day is invalid");
		}
		
		scn.close();
	}

}
