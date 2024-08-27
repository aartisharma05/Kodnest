public class IsPalindrome {
	
	static boolean isPalindrome(int n) {
		
		int temp = n;
		int revNum = 0;
		
		boolean isPalindrome = false;
		
		while(temp!=0) {
			int digit = temp%10;
			revNum = revNum*10+digit;
			temp = temp/10;
		}
		
		if(revNum == n) {
			isPalindrome = true;
		}
		
		return isPalindrome;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		boolean res = isPalindrome(n);
		
		if(res == true) {
			System.out.println("Yes"); }
		else{
			System.out.println("No") ;
		}
		
		scn.close();
		
	}

}
