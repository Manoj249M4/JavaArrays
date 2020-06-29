package com.java.miscprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayFindDuplicateElements {

	public static void main(String[] args) {

		String[] withDuplicates = { "one", "two", "three", "one" };
		String[] withoutDuplicates = { "one", "two", "three" };

		System.out.println("Checking array with duplicate using brute force: " + findWithBruteforce(withDuplicates));
		System.out.println(
				"Checking array without any duplicate using brute force: " + findWithBruteforce(withoutDuplicates));

		System.out
				.println("Checking array with duplicate using Set and List: " + checkDuplicateUsingSet(withDuplicates));
		System.out.println("Checking array without any duplicate using Set and List: "
				+ checkDuplicateUsingSet(withoutDuplicates));
		
		System.out.println("Checking array with duplicate using Set and List: " + checkDuplicateUsingAdd(withDuplicates));
        System.out.println("Checking array without any duplicate using Set and List: " + checkDuplicateUsingAdd(withoutDuplicates));

	}

	public static boolean findWithBruteforce(String[] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (input[i].equals(input[j]) && i != j) {
					return true;
				}
			}
		}

		return false;
	}

	/*
	 * detect duplicate in array by comparing size of List and Set since Set
	 * doesn't contain duplicate, size must be less for an array which contains
	 * duplicates
	 */

	public static boolean checkDuplicateUsingSet(String[] input) {
		List<String> inputList = Arrays.asList(input);
		Set<String> inputSet = new HashSet<>(inputList);
		if (inputSet.size() < inputList.size()) {
			return true;
		}
		return false;
	}

	/*
	 * Since Set doesn't allow duplicates add() return false if we try to add
	 * duplicates into Set and this property can be used to check if array
	 * contains duplicates in Java
	 */

	public static boolean checkDuplicateUsingAdd(String[] input) {
		Set<String> tempSet = new HashSet<>();
		for (String string : input) {
			if (!tempSet.add(string)) {
				return true;
			}
		}
		return false;
	}

}
