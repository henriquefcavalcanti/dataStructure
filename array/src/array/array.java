package array;

public class array {

	public static void main(String[] args) {
		int intArray[]; // declaring array
		intArray = new int[20]; // allocating memory to array
		
		int[] intArray2 = new int[20]; // combining both statements in one
		
		System.out.println(intArray[5]);
		System.out.println(intArray2[15]);
		
		char charArray[] = new char[10];
		System.out.println(charArray[3] + ".");
		
		int[] intArray3 = new int[]{1,2,3,4,5,6};
		System.out.println(intArray3[5]);
		
	}

}
