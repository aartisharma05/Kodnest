package com.kodnest.oops.interfaces.calculator;

public class EpsonCalculator extends ScientificCalculator {

	
	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Division is: " + a/b);
	}
	
	boolean isPrime(int a) {
		for(int i = 2;i<=a/2;i++) {
			if(a%i==0) {
				System.out.println("Not prime");
				return false;
			}
		}
		
		System.out.println("Prime");
		return true;
	}

}
