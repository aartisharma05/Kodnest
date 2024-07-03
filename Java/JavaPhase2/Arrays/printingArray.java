package arrays;
 import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      float []arr = new float[7];
      Scanner scn = new Scanner(System.in);
      
     for(int i =0;i<7;i++) {
    	 System.out.println("Enter the percentage for Student: "+ (i+1));
    	 arr[i] = scn.nextFloat();
    	
   }
      
      System.out.println("The percentages of all the students are: ");
      for(int i =0;i<7;i++) {
    	  System.out.println(arr[i]);
      }
      
      scn.close();
      
	}
	

}
