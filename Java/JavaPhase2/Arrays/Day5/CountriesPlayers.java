package arrays;
import java.util.Scanner;
public class Day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no of Countries and Players");
		
		
		String [][]data = new String[scn.nextInt()][scn.nextInt()];
		
		scn.nextLine();
		
		for(int i=0;i<=data.length-1;i++) {
			for(int j=0;j<=data[i].length-1;j++) {
				data[i][j] = scn.nextLine();
			}
		}
		
		
		for(int i=0;i<=data.length-1;i++) {
			for(int j=0;j<=data[i].length-1;j++) {
			
				System.out.print(data[i][j] + " ");
				
			}
			System.out.println("\n");
		}
		scn.close();
	}

}
