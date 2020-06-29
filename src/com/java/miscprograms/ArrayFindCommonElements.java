package com.java.miscprograms;

import java.util.HashSet;

public class ArrayFindCommonElements {

	public static void main(String[] args) {
		commonElements(new int[]{ 2, 4, 6, 7, 5}, new int[]{ 2, 3, 9, 7, 5} );
	}
	
	public static void commonElements(int[] arrayOne, int[] arrayTwo){
		
		HashSet<Integer> set = new HashSet<>();
			for (int i = 0; i < arrayOne.length; i++) {
				if (arrayOne[i] == arrayTwo[i]) {
					set.add(arrayOne[i]);
				}
			}
			System.out.println(set);
	}

}
