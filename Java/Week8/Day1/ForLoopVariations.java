package loops;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =1, j=1; i<=5;i++,j++) {
			System.out.println("i: "+ i + " j: "+j);
		}
		
		System.out.println();
		for(int i =5, j=1; j<=5;i--,j++) {
			System.out.println("i: "+ i + " j: "+j);
		}
		System.out.println();
		
		for(int i =1, j=5; i<=5;i++,j--) {
			System.out.println("i: "+ i + " j: "+j);
		}
		
		System.out.println();
		for(int i =5, j=5; i>=1;i--,j--) {
			System.out.println("i: "+ i + " j: "+j);
		}
		
		System.out.println();
		
		for(int i =5, j=5; j>=1 ;i--,j--) {
			System.out.println("i: "+ i + " j: "+j);
		}
		
       
	}

}
