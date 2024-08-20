package com.kodnest.exceptionHandling;

import java.util.Scanner;

class DrivingLicenseUnderAgeException extends Exception {
	
	public DrivingLicenseUnderAgeException() {
		super("User is Under-age.");
	}
}

class DrivingLicenseOverAgeException extends Exception {
	public DrivingLicenseOverAgeException() {
		super("User is Over-age.");
		
	}
}

public class CheckDrivingLicenseEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the age: ");
		int age = scn.nextInt();
		try {
			checkAgeEligibility(age);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.print("Catch block executed");
		}
 
		scn.close();

	}
	
	
	public static void checkAgeEligibility(int age) throws Exception {
		
		if(age<18) {
			DrivingLicenseUnderAgeException uae = new DrivingLicenseUnderAgeException();
			throw uae;
		}
		else if (age>65) {
			DrivingLicenseOverAgeException oae = new DrivingLicenseOverAgeException();
			throw oae;
		}
		else {
			System.out.println("User is eligible for driving license.");
		}
		
		
	}

}
