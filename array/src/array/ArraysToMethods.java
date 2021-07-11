package array;

// Java program to demonstrate passing of array to methods

public class ArraysToMethods {
	
	public static void main(String[] args) {
		int arr[] = {3,1,2,5,4};
		sum(arr); // passing array to method
		
	}
	
	public static void sum(int[] arr) {
		int sum = 0; // getting sum of array values
		
		for(int i = 0; i< arr.length; i++) {
			sum+= arr[i];
		}
		System.out.println("Sum of array values = " + sum);
	}

}
