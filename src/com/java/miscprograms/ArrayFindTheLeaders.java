package com.java.miscprograms;

import java.util.Arrays;

public class ArrayFindTheLeaders {

	public static void main(String[] args) {
		findTheLeaders1(new int[] { 12, 9, 7, 14, 8, 6, 3 });
		findTheLeaders2(new int[] { 55, 67, 71, 57, 51, 63, 38 });
	}

	//Descending order
	public static void findTheLeaders1(int[] array) {
		Arrays.sort(array);
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}

		System.out.println(Arrays.toString(array));
	}

	//Find leaders
	public static void findTheLeaders2(int[] inputArray) {
		// Assuming the last element as max
		int max = inputArray[inputArray.length - 1];
		System.out.println("The leaders in " + Arrays.toString(inputArray) + " are : ");
		System.out.println(max);
		for (int i = inputArray.length - 2; i >= 0; i--) {
			if (inputArray[i] > max) {
				System.out.println(inputArray[i]);
				max = inputArray[i];
			}
		}
	}
}
