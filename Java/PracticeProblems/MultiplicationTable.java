package practiceDay3;

import java.util.Scanner;

public class MultiplicationTable {
    
	public static void multiplicationTable(int num) {
		for(int i = 1; i<=10; i++) {
			System.out.println( num + " * " + i + " = " + num*i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        multiplicationTable(num);
        scan.close();
	}

}
