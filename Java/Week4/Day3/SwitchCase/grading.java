
package switchCase;
import java.util.*;


public class switchCase {
   public static void main(String []args) {
	   System.out.println("Please Enter Grade: ");
	   
	   Scanner scn = new Scanner(System.in);
	   int grade = scn.nextInt();

	   
	   
	   
	   switch(grade) {
	   case 10: System.out.println("Grade is : " + grade + "Outstanding ");
	   break;
	   
	   case 9: System.out.println("Grade is : " + grade + " Excellent");
	   break;
	   
	   case 8: System.out.println("Grade is : " + grade + "Very Good ");
	   break;
	   
	   
	   case 7: System.out.println("Grade is : " + grade + "good ");
	   break;
	   
	   
	   case 6: System.out.println("Grade is : " + grade + "Can do good ");
	   break;
	   
	   case 5: System.out.println("Grade is : " + grade + "Bad ");
	   break;
	   
	   
	   default: System.out.println("Grade is : " + grade + "Very Bad ");
	   
	   
	   
	  
	   
	   }
	   
	   scn.close();
	   }
}
