package array;

// Java program to demonstrate return of array from method

public class ArrayFromMethods {

	public static void main(String[] args) {
		int arr[] = m1();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] m1() {
		return new int[] { 1, 2, 3 };
	}

}