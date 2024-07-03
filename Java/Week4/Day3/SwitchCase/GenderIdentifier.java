
package switchCase;
import java.util.*;


public class switchCase {
   public static void main(String []args) {
	   System.out.println("For male enter 200 and for female enter 300 : ");
	   
	   Scanner scn = new Scanner(System.in);
	   int gender = scn.nextInt();
	   

	   
	   if(gender == 200) {
		   
		   System.out.println("Gender is Male");
		 
		   System.out.println("Please enter the index value for Male(from 1-10): ");
		   int index = scn.nextInt();
		  
		   
		   switch(index) {
		   case 10: 
		   case 9: System.out.println("Good");
		   break;
		  
		   case 8:
		   case 7: System.out.println("OK");
		   break;
		   
		   
		   case 6:
		   case 5: System.out.println("Bad");
		   break;
		   
		   
		   default: System.out.println("Very Bad ");   
		  	   
		   }
	   }
		   else  if(gender == 300) {
			   
			 
			   System.out.println("Gender is Female");
			   System.out.println("Please enter the index value for Male(from 1-10): ");
			   int findex = scn.nextInt();
			   
			   switch(findex) {
			   case 10: 
			   case 9:
			   case 8: System.out.println("Very Very Good");
			   break;
			   case 7: 
			   case 6:System.out.println("Very Good");
			   break;
			   
			   case 5: 
			   case 4: 
			   case 3: System.out.println("Good");
			   break;
			   
			   
			   default: System.out.println("OK");   
			  	   
			   }
		   
			   
	   }
	   
		   else {
			   System.out.println("Please only enter values either 200 or 300");
		   }
	   
	   
	   
	 
	   
	   scn.close();
	   }
}
