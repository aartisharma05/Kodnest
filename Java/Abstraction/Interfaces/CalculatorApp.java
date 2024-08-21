package com.kodnest.oops.interfaces;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		SimpleCalculator sc = new SimpleCalculator();
		AdvanceCalculator ac = new AdvanceCalculator();
		ScientificCalculator sciec = new ScientificCalculator();
    
		Calculation calc = new Calculation();
		
		System.out.println("Simple Calculator");
		calc.acceptCalculation(sc, 10, 5);
		
		System.out.println("==========================================");
		
		System.out.println("Enter numbers for Advance Calculator: ");
		int m1 = scn.nextInt();
		int m2 = scn.nextInt();
		calc.acceptCalculation(ac, m1, m2);
		
		System.out.println("==========================================");
		
		System.out.println("Enter numbers for scientific Calculator: ");
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		
		calc.acceptCalculation(sciec, n1, n2);
		
		scn.close();
		
	}

}
