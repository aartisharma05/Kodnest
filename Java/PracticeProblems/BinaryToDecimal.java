package practiceDay3;

import java.util.Scanner;

public class BinaryToDecimal {
	
	public static void binaryToDecimal(int num) {
		 int temp = num;
		 int dec_value = 0;
		 int base =1;
		 while(temp>0) {
			 int last_dig = temp%10;
			 temp = temp/10;
			 dec_value += last_dig*base;
			 base = base*2;
		 }
		 System.out.println("Decimal = " + dec_value);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scn = new Scanner(System.in);
     int num = scn.nextInt();
     binaryToDecimal(num);
     scn.close();
	}

}
