package test;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		String name = "Pravin";
	    String name1 = "Ujjwala is beautiful";
	    
	    System.out.println("num of char in string is " + name1.length());
	    System.out.println("the 4th char in the string is " + name1.charAt(3));
	    System.out.println("the last char in the string is " + name1.charAt(name1.length()-1));
	    System.out.println("the string in UpperCase is " + name1.toUpperCase());
	    System.out.println("the string in LowerCase is " + name1.toLowerCase());
	}

}
