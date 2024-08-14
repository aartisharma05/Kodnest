package practiceDay3;

import java.util.Scanner;

public class CelsiusToFahrenheitApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scn = new Scanner(System.in);
   int temp = scn.nextInt();
   CelsiusToFahrenheit ctf = new CelsiusToFahrenheit();
   ctf.celsiusToFahrenheit(temp);
   scn.close();
	}

}
