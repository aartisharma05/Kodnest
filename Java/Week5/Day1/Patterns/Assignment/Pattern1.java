package loops;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int lines=1;lines<=3;lines++) {
			for(int col= lines; col<=3;col++) {
				System.out.print("*");
				System.out.print("#");
				
			}
			System.out.println();
		}

	}

}
