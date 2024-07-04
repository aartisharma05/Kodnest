package arrays;
import java.util.Scanner;
public class ThreeDRegularArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the no of schools, class and students in each class");
		
		int [][][]arr = new int[scn.nextInt()][scn.nextInt()][scn.nextInt()];
		
		for(int i =0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.println("Enter the School " +(i+1) + " Class : " + (j+1) + " No of students :");
					arr[i][j][k] = scn.nextInt();
				}
			}
		}
		
		
		for(int i =0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
				    System.out.println("School" +(i+1) + "Class " + (j+1) + " No of students :" + arr[i][j][k]);
				    		
				}
			}
		}
		
		
		scn.close();
	}

}
