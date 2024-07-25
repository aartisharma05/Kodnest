import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a string to be reversed: ");
		String str = scn.nextLine();
		
//		String revStr = "";
//		
//		for(int i = str.length()-1;i>=0;i--) {
//			revStr = revStr + str.charAt(i);
//		}
//		
//		System.out.println("Reversed String is: " + revStr);

		
		char[] arr= str.toCharArray();
		
		char[] revArr = new char[arr.length];

		
		for(int i = 0;i<= arr.length-1;i++) {
			if(arr[i] == ' ') {
		
				revArr[i] = arr[i];
			}
		    
		}
		
		int j = revArr.length-1;
		for(int i =0;i<= arr.length-1;i++) {
			if(arr[i] != ' ') {
				if(revArr[j] == ' ') {
					j--;
				}
			revArr[j] = arr[i];
			j--;
			}
			
			
		}
		
		
		String revStr = new String(revArr);
		
		System.out.println(revStr);
	}

}



// O/p-

// Enter a string to be reversed: 
// Raja ram mohan roy
// yorn aho mmara jaR
