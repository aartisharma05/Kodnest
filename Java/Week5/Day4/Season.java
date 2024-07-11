import java.util.Scanner;
public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Month number to be checked the season of: ");
		int num = scn.nextInt();
		
		if(num==12|| num==1|| num==2) {
			System.out.println("Winter");
		}else if(num==3|| num==4|| num==5) {
			System.out.println("Spring");
		}
		else if(num==6|| num==7|| num==8) {
			System.out.println("Summer");
		}
		else if(num==9|| num==10|| num==11) {
			System.out.println("Rainy");
		}
		else {
			System.out.println("Invalid Input");
		}
		
		
		scn.close();
	}

}



// Enter the Month number to be checked the season of: 
// 9
// Rainy
