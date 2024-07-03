package arrays;

import java.util.Scanner;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		System.out.println("Enter the total number of employees: ");
        Scanner scn = new Scanner(System.in);
        int noOfEmployees = scn.nextInt();
         
        scn.nextLine();
    	String []arr = new String[noOfEmployees];
    	
    	for(int i =0;i<=noOfEmployees-1;i++) {
    		arr[i] = scn.nextLine();
    	}
    	
    	System.out.println("Names of the employees are: ");
    	for(int i =0;i<=noOfEmployees-1;i++) {
    		System.out.println(i + "."+ arr[i]);
    	}
    	
    	scn.close();
	}

}
