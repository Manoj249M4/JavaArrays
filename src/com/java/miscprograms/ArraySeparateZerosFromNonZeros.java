package com.java.miscprograms;

import java.util.Arrays;

public class ArraySeparateZerosFromNonZeros {

	public static void main(String[] args) {
		moveZerosToEnd(new int[] { 12, 0, 7, 0, 8, 0, 3 });
		moveZerosToEnd(new int[]{ 1, -5, 0, 0, 8, 0, 1 });
		moveZerosToFront(new int[]{ 1, -5, 0, 0, 8, 0, 1 });
	}

	public static void moveZerosToEnd(int[] inputArray) {
		int counter = 0;

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] != 0) {
				inputArray[counter] = inputArray[i];
				counter++;
			}
		}

		/*while (counter < inputArray.length) {
			inputArray[counter] = 0;
			counter++;
		}*/
		
		for (int i = counter; i < inputArray.length; i++) {
			inputArray[counter] = 0;
			counter++;
		}
		
		/*for (int i = 0; i < inputArray.length/2; i++) {
			int temp = inputArray[i];
			inputArray[i] = inputArray[inputArray.length-1-i];
			inputArray[inputArray.length-1-i] = temp;
		}*/
		System.out.println(Arrays.toString(inputArray));
	}
	
	public static void moveZerosToFront(int[] inputArray) {
		int counter = inputArray.length - 1;
		for (int i = inputArray.length - 1; i >= 0; i--) {
			if (inputArray[i] != 0) {
				inputArray[counter] = inputArray[i];
				counter--;
			}
		}
		while (counter>=0) {
			inputArray[counter] = 0;
			counter--;
		}
		System.out.println(Arrays.toString(inputArray));
	}
	

}
