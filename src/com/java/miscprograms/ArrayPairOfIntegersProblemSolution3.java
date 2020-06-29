package com.java.miscprograms;

import java.util.Arrays;

public class ArrayPairOfIntegersProblemSolution3 {

	public static void main(String[] args) {
		prettyPrint(new int[]{ 12, 14, 17, 15, 19, 20, -11 }, 9);
		prettyPrint( new int[]{ 2, 4, 7, 5, 9, 10, -1}, 11);
		
	}

	public static void printPairsUsingTwoPointers(int[] numbers, int k) {
		if (numbers.length < 2) {
			return;
		}
		Arrays.sort(numbers);
		int left = 0;
		int right = numbers.length - 1;
		while (left < right) {
			int sum = numbers[left] + numbers[right];
			if (sum == k) {
				System.out.printf("(%d, %d)%n", numbers[left], numbers[right]);
				left = left + 1;
				right = right - 1;
				
			} else if (sum < k) {
				left++;
				
			} else if (sum > k) {
				right--;
			}
		}
	}
	
	public static void prettyPrint(int[] array, int k){
		System.out.println("Input int array: "+ Arrays.toString(array));
		System.out.println("All pairs in an array of integers whose sum is equal to a given value " + k);
		printPairsUsingTwoPointers(array, k);
		
	}
}
