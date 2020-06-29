package com.java.miscprograms;

import java.util.Arrays;

public class ArrayCopyingInJava {

	public static void main(String[] args) {
		// original array has 10 elements
		int [] original = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		System.out.println("Original array: "+ Arrays.toString(original));
		// exact copy of the array
		int [] copy = Arrays.copyOf(original, 10);
		System.out.println("exact copy: "+Arrays.toString(copy));
		// copy only first elements
		int firstFive[] = Arrays.copyOf(original, 5);
		System.out.println("Copied first five elements: "+ Arrays.toString(firstFive));
		//create a larger array by copying
		int [] bigger = Arrays.copyOf(original, 15);
		System.out.println("bigger copy: "+ Arrays.toString(bigger));
		// copying sub-array from 2nd element to 5th element
		int [] range = Arrays.copyOfRange(original, 3, 7);
		System.out.println("copying range of values 3 to 7: "+ Arrays.toString(range));
		System.out.println(range[0]);
	}

}
