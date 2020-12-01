package q2;

import java.util.Scanner;

public class ConcatenateArrays {
	static Scanner scanner = new Scanner(System.in);
	
	/*public static void main(String[] args) {
		int[] array = ConcatenateTwoArrays();
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}*/
	
	
	public int[] ConcatenateTwoArrays() {

		System.out.print("Enter the size of your 'first' array: ");
		int size1 = scanner.nextInt();
		if(size1 <= 0) {
			throw new IllegalArgumentException("Size can't be 0 or negative.");
		}
		int[] array1 = new int[size1];
		System.out.print("Enter the first array's numbers: ");
		for(int i = 0; i < size1; i++) {
			array1[i] = scanner.nextInt();
		}
		
		System.out.print("Enter the size of your 'second' array: ");
		int size2 = scanner.nextInt();
		if(size2 <= 0) {
			throw new IllegalArgumentException("Size can't be 0 or negative.");
		}
		int[] array2 = new int[size2];
		System.out.print("Enter the second array's numbers: ");
		for(int i = 0; i < size2; i++) {
			array2[i] = scanner.nextInt();
		}
		
		int[] result = new int[size1+size2];
		for(int i = 0; i < array1.length; i++) {
			result[i] = array1[i];
		}
		for(int i = 0; i < array2.length; i++) {
			result[i+array1.length] = array2[i];
		}
		
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		return result;
		
	}

}
