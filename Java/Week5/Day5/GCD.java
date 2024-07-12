import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter two numbers to find GCD: ");
		int m = scn.nextInt();
		int n = scn.nextInt();
		
		int rem = 0;
		
		System.out.print("GCD of "+ m +" and " + n + " is: " );
		while(n!=0) {
			rem = m%n;
			m=n;
			n=rem;
		}
		
		System.out.print(m);
		scn.close();
		}

}



// Enter two numbers to find GCD: 
// 4
// 8
// GCD of 4 and 8 is: 4
