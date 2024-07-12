import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number till where fabonacci series to be printed: ");
		int n = scn.nextInt();//Taking number as input
		
		int num1 =0;
		int num2 = 1;
		int sum = 0;
		
		if(n ==1) {
			System.out.println(num1);//printing 0 if number is 0;
		}
		else if(n ==2 ) {
			System.out.print(num1 + " " + num2);//printing 0 and 1 if number is 2
		}
		else if(n>0){
			System.out.print(num1 + " " + num2);//if number is not 1 and 2 and positive printing from the 
			
	
			for(int i=3;i<=n;i++) {
				sum = num1+num2;
				
				System.out.print(" " + sum);
				
				num1 = num2;
				num2 = sum;
				
			}
				
		}
		
		scn.close();

	}

}




