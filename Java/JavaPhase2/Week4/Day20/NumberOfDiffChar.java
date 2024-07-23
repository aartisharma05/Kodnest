package strings.kodnest.com;
import java.util.Scanner;
public class NumberOfDiffChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter string to be reversed: ");
		String s1= scn.nextLine();
		scn.close();
		
		int lowerCase=0 , upperCase=0, specialChar = 0, numbers = 0;
		
	    char [] arr = s1.toCharArray();
	    
	    for(int i=0;i<=arr.length-1;i++) {
	    	if( arr[i]>='a' && (int)arr[i]<='z' ) {
	    		lowerCase++;
	    	}
	    	else if(arr[i]>='A' && arr[i]<='Z' ) {
	    		upperCase++;
	    	}
	    	else if(arr[i]>='0' && arr[i]<='9' ) {
	    		numbers++;
	    	}
	    	else {
	    		specialChar++;
	    	}
	    }
	    
	    
	    System.out.println("Lower case: "+ lowerCase);
	    System.out.println("Upper case: "+ upperCase);
	    System.out.println("Special char: "+ specialChar);
	    System.out.println("Numbers : "+ numbers);
		
	}

}



// O/p-

// Enter string to be reversed: 
// JavA@123
// Lower case: 2
// Upper case: 2
// Special char: 1
// Numbers : 3



