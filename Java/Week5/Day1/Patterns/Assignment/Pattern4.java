package loops;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int lines=1;lines<=4;lines++) {
			for(int col= 1; col<=(2*lines);col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}



// O/p - 

// **
// ****
// ******
// ********
