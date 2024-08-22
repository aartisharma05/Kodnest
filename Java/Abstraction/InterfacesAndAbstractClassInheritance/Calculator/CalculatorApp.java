package com.kodnest.oops.interfaces.calculator;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		EpsonCalculator ec = new EpsonCalculator();

		System.out.println("Enter two numbers: ");
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		ec.add(n1, n2);
		ec.sub(n1, n2);
		ec.mul(n1, n2);
		ec.div(n1, n2);
		ec.mod(n1, n2);
		ec.isPrime(n1);


		scn.close();
	}

}
