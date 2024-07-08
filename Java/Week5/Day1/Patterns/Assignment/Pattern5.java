package loops;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int lines=1;lines<=4;lines++) {
			for(int col= 1; col<=(lines);col++) {
				System.out.print(lines);
				
			}
			for(int col= 1; col<=(lines);col++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}

}


// O/p-
// 1*
// 22**
// 333***
// 4444****
