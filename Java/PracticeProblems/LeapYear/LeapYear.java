package practiceDay3;

public class LeapYear {
  
	void leapYear(int year) {
		if(year%4==0 && year%100!=0 || year%400 == 0) {
			System.out.println(year + " is a leap year");
		}
		else {
			System.out.println(year + " is not a leap year");
		}
	}
}
