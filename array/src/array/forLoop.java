package array;

// Java program to illustrate creating an array of integers, puts some values in the array, 
// and prints each value to standard output.

public class forLoop {

	public static void main(String[] args) {

		int[] arr; // declares an Array of integers.
		arr = new int[5]; // allocating memory for 5 integers.

		// initialize the elements of the array.
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element at index " + i + ": " + arr[i]);
		}

	}

}
