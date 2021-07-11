package array;

// Java program to demonstrate cloning of one-dimensional arrays

public class CloningArray {
	
	public static void main(String[] args) {
		int intArray[] = {1,2,3};
		int intArray2[] = {1,2,3};
		int intArray3[] = intArray;
		
		int cloneArray[] = intArray.clone();
		
		System.out.println(intArray == cloneArray);
		System.out.println(intArray == intArray2);
		System.out.println(intArray == intArray3);
		
		for (int i = 0; i < cloneArray.length; i++) {
			System.out.print(cloneArray[i] + " ");;
		}
		
	}

}
