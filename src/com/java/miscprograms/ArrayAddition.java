package com.java.miscprograms;

import java.util.Arrays;

public class ArrayAddition {

	public static void main(String[] args) {
		int[] even = { 1, 2, 3, 4, 5 };
		int[] odd = { 2, 3, 4, 5, 6 };
		int[] result = arrayAddition(even, odd);
		System.out.println(Arrays.toString(result));
		
		int[] prime = { 2, 3, 5, 7, 11, 13 };
		result = arrayAddition(even, prime);
		System.out.println(Arrays.toString(result));
	}

	public static int[] arrayAddition(int[] first, int[] second) {
		int length = first.length < second.length ? first.length : second.length;
		int[] result = new int[length];
		for (int i = 0; i < length; i++) {
			result[i] = first[i] + second[i];
		}
		return result;
	}
}
