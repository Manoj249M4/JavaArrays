package com.java.miscprograms;

import java.util.Arrays;

public class ArrayReverseExample {

	public static void main(String[] args) {
		int numbers[] = {1,2,3,4,5,6,7};
		reverse(numbers);
	}

	private static void reverse(int[] numbers) {
		
		for (int i = 0; i < numbers.length/2; i++) {
			int temp = numbers[i];
			numbers[i] = numbers[numbers.length - 1 - i];
			numbers[numbers.length - 1 - i] = temp;
		}
		System.out.println("reversed array :" + Arrays.toString(numbers));
	}

}
