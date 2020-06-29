package com.java.miscprograms;

public class ArrayEqualityCheck {

	public static void main(String[] args) {
		equalityCheck(new int[]{ 2,3,4,5,6,7,5,4 }, new int[]{ 2,3,4,5,6,7,5,1 });
	}

	public static void equalityCheck(int[] arrayOne, int[] arrayTwo) {
		boolean equalOrNot = true;
		if (arrayOne.length == arrayTwo.length) {
			for (int i = 0; i < arrayOne.length; i++) {
				if (arrayOne[i] != arrayTwo[i]) {
					equalOrNot = false;
				}
			}
		} else {
			equalOrNot = false;
		}
		
		if (equalOrNot) {
			System.out.println("Two arrays are equal");
		} else {
			System.out.println("Two arrays are not equal");
		}
	}

}
