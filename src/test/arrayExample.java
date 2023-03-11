package test;

public class arrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1  = {10,20,30,40,50};
		System.out.println("length of the array is " + array1.length);
		System.out.println("the first no of the array is " + array1[2]);
		System.out.println("the last no of the array is " + array1[array1.length-1]);
		
		
		String[] array2 = {"Mon","Tue","Wed","Thu","Fri","Sat"};
		    System.out.println("length of the second arr is " + array2[1]);
		    
		    String str = "clean world green world happy world";
		    String[] arr3 = str.split(" ");
		    
		    System.out.println("total no of world in the arr3 " + arr3.length);
	}

}
