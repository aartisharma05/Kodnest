package arrays;
import java.util.Scanner;

public class StudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		System.out.println("Enter the no of classes and no of students");
		Scanner scn = new Scanner(System.in);
		Boolean [][]backlogs  = new Boolean[scn.nextInt()][ scn.nextInt()];
		 
		for(int i =0;i<=backlogs.length-1;i++) {
			for(int j=0;j<=backlogs[i].length-1;j++) {
				System.out.println("is student "+ (j+1)  + " of class " + (i+1) + "is having backlog. Please enter true or false");
				backlogs[i][j] = scn.nextBoolean()	;
			}
		}
		
		
		for(int i =0;i<=backlogs.length-1;i++) {
			for(int j=0;j<=backlogs[i].length-1;j++) {
				System.out.println("The backlog status for student "+ (j+1) + " of class " + (i+1) + " is : "+backlogs[i][j]);
			
			}
		}
	}

}
