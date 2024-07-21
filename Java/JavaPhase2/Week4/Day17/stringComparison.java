package strings.kodnest.com;

public class StringComparisonProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 = "Java Sql Python";
		
		String s2 = "JAVA SQL PYTHON";
		
		
		if(s1 == s2)  System.out.println("References are same");
		else System.out.println("References are not same");
		
		
		if( s1.equals(s2)) System.out.println("Values are same");
		else System.out.println("Values are not same");
		
		if(s1.equalsIgnoreCase(s2)) System.out.println(" After ignoring case values are same");
		else System.out.println("After ignoring case values are not same");

	}

}
