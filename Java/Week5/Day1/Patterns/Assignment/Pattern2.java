package loops;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		for(int lines=1;lines<=3;lines++) {
			for(int col= 5; col>=(2*lines-1);col--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}


// *****
// ***
// *