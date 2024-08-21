package com.kodnest.oops.interfaces;

public class Calculation {
	
	public void acceptCalculation(Calculator c, int num1, int num2) {
		c.add( num1, num2);
		c.sub( num1, num2);
		c.mul( num1, num2);
		c.div( num1, num2);
		c.mod( num1, num2);
	}

}
