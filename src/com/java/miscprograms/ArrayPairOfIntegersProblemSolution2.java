package com.java.miscprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayPairOfIntegersProblemSolution2 {

	public static void main(String[] args) {
		prittyPrint(getRandomArray(9), 11);
		prittyPrint(getRandomArray(10), 12);
	}

	public static void printPairsUsingSet(int[] numbers, int n) {
		if (numbers.length < 2) {
			return;
		}
		Set<Integer> set = new HashSet<Integer>();
		for (int value : numbers) {
			int target = n - value;
			if (!set.contains(target)) {
				set.add(value);
			} else {
				System.out.printf("(%d, %d) %n", value, target);

			}
		}
	}

	public static void prittyPrint(int[] random, int k) {
		System.out.println("Random integer array: " + Arrays.toString(random));
		System.out.println("Sum : " + k);
		System.out.println("pair of numbers from an array whose sum equals " + k);
		printPairsUsingSet(random, k);
	}

	public static int[] getRandomArray(int length) {
		int[] randoms = new int[length];
		for (int i = 0; i < length; i++) {
			randoms[i] = (int) (Math.random() * 15);
		}
		return randoms;

	}
}
