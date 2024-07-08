// find the sum in range which should not include prime numbers


package loops;
import java.util.Scanner;
public class ContinueInLooping {
	
	
	public static boolean isPrime(int num) {
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	
		System.out.println("Please enter the starting and ending number you want to get sum of Prime numbers: ");
		int start= scn.nextInt();
		int end = scn.nextInt();
		
		int sum = 0;
			if(start>=2) {			
				for(int i= start;i<= end;i++) {
					if(isPrime(i) == true) {
						System.out.print(sum + " + " + i + " =  ");
						sum = sum+i;
						System.out.println(sum);
					}
				}
			}
			else {
				System.out.println("Please enter correct range");
			}
		System.out.println();
		System.out.println("SUM is " + sum);
		
		scn.close();
	}
	

}
