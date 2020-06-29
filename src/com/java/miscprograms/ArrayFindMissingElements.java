package com.java.miscprograms;

import java.util.Arrays;

public class ArrayFindMissingElements {

	public static void main(String[] args) {
		Integer[] input = { 2, 3, 5, 3, 7, 45, 65, 7, 3};
		System.out.printf("Does array %s has %s? %b %n", Arrays.toString(input),45,isExists(input, 45));
		System.out.printf("Does array %s contains %s?  %b %n", Arrays.toString(input), 5, contains(input, 5));
        System.out.printf("Does array %s has %s?  %b %n", Arrays.toString(input), 7, isExists(input, 7));
        System.out.printf("Does Integer array %s contains %s?  %b %n", Arrays.toString(input), 6, contains(input, 6));

        String[] names = new String[]{"JP", "KP", "RP", "OP", "SP"};
        System.out.printf("Does array %s has %s?  %b %n", Arrays.toString(names), "JP", isExists(names, "JP"));
        System.out.printf("Does String array %s contains %s?  %b %n", Arrays.toString(names), "JP", contains(names, "JP"));
        System.out.printf("Does array of names %s has %s?  %b %n", Arrays.toString(names), "MP", isExists(names, "MP"));
        System.out.printf("Does array %s contains %s?  %b %n", Arrays.toString(names), "UP", contains(names, "UP"));
		
	}

	public static <T> boolean isExists(final T[] array, final T object) {
		return Arrays.asList(array).contains(object);
	}
	
	public static <T> boolean contains(final T[] array, final T v) {
		for (final T e : array) {
			if (e == v || v != null && e.equals(v)) {
				return true;
			}
		}
		return false;
	}
}
