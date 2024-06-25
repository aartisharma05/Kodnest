package methods;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a =20;
		int b = 5;
		addition();
		subtraction(a,b);
		int mul = multiplication();
		System.out.println("Multiplication is : " + mul);
		int quo = quotient(a,b);
		System.out.println("Quotient is : " + quo);
		int rem = remainder(a,b);
		System.out.println("Remainder is : " + rem);
		
	}
	
	
	public static void addition() {
		int a =10;
		int b = 20;
		int sum = a+b;
		
		System.out.println("Addition is : " + sum);
	}
	
	public static void subtraction(int a, int b) {
		int sub = a-b;
		System.out.println("Subtraction is : " + sub);
	}
	
	public static int multiplication() {
		int a =10;
		int b = 20;
		
		return a*b;
	}
	
	
	public static int quotient(int a, int b) {
		
		return a/b;
	}
	
	
public static int remainder(int a, int b) {
		
		return a%b;
	}
	
	
	

}
