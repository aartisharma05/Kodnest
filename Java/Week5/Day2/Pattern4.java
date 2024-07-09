package Patterns;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("-");
			}
			
			for(int k=1, n=6;k<=(n-i);k++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}		
	}

}



// -*****
// --****
// ---***
// ----**
// -----*

