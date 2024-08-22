package com.kodnest.oops.interfaces.calculator;

public abstract class ScientificCalculator extends Calculator implements Calculator1, Calculator2{
	


	@Override
	
	public void add(int a, int b) {
		System.out.println("Addition is: " + a+b);
	}
	
@Override
	
	public void sub(int a, int b) {
		System.out.println("Subtraction is: " + (a-b));
	}

@Override

public void mul(int a, int b) {
	System.out.println("Multiplication is: " + a*b);
}
}
