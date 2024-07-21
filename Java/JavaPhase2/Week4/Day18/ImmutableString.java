package strings.kodnest.com;

public class ImmutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1= "Java";
		
		s1.concat("SQL");
		
		System.out.println(s1);
		
		String s2 = s1.concat("Python");
		
		
		System.out.println(s1);
		System.out.println(s2);

	}

}


// O/p-

// Java
// Java
// JavaPython
