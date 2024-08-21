package com.kodnest.oops.interfaces;


public class ScientificCalculator implements Calculator {


	@Override
	public void add(int num1, int num2) {
		if(num1== 0 || num2==0) {
			System.out.println("Why calculator");
		}
		else {
			System.out.println( "Addition is:" + num1+num2);
		}


	}

	@Override
	public void sub(int num1, int num2) {
		if(num1== 0 || num2==0) {
			System.out.println("Why calculator");
		}
		else {
			System.out.println("Subtraction is:" + (num1-num2));
		}

	}

	@Override
	public void mul(int num1, int num2) {
		if(num1== 0 || num2==0) {
			System.out.println("Why calculator");
		}
		else {
			System.out.println("Multiplication is:" + num1*num2);
		}

	}

	@Override
	public void div(int num1, int num2) {
		if(num1== 0 || num2==0) {
			System.out.println("Why calculator");
		}
		else {
			System.out.println("Division is:" + num1/num2);
		}

	}

	@Override
	public void mod(int num1, int num2) {
		if(num1== 0 || num2==0) {
			System.out.println("Why calculator");
		}
		else {
			System.out.println("Modulus is:" + num1%num2);
		}

	}

}
