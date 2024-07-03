package arrays;
import java.util.Scanner;
public class CompanyData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of companies: ");
		int noComp = scn.nextInt();
		
		System.out.println("Enter the number of Employees in each company: ");
		int noEmp = scn.nextInt();
	
		
		
		
		String [][]names = new String[noEmp][noComp];
		scn.nextLine();
		for(int i=0;i<=names.length-1;i++) {
			for(int j=0;j<=names[i].length-1;j++) {
				
				System.out.println("Enter Employee name : " + (j+1)+ "working in company "+ (i+1));
				names[i][j] = scn.nextLine();
				
			}
		}
      
		
		
		for(int i=0;i<=noEmp-1;i++) {
			for(int j=0;j<=noComp-1;j++) {
				System.out.println("Employee name: "+ names[i][j] + " works in: " + (i+1));
				
			}
		}
	}

}
