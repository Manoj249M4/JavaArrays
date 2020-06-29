package com.java.miscprograms;

import java.util.Arrays;

public class ArraysInJava {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		//int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		//System.out.println(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element at index " + i + " : " + array[i]);
		}
		System.out.println("===================1================");
		System.out.println("Enhanced For loop");
		
		for (int j : array) {
			System.out.println(j);
		}
		System.out.println("===================2================");
		
		int multDarray[][] = new int[][]{ { 1, 2, 3 }, { 3, 4, 5 }, { 5, 6, 7 } };
		//int multDarray[][] = { { 1, 2, 3 }, { 3, 4, 5 }, { 5, 6, 7 } };
		for (int i = 0; i < multDarray.length; i++) {
			for (int j = 0; j < multDarray.length; j++){
				System.out.print(multDarray[i][j] + " ");
			}
			System.out.println();

		}
		System.out.println("===================3================");
		
		int array_variable[] = new int[10];
		for(int i=0; i<array_variable.length; ++i){
			array_variable[i] = i;
			System.out.println(array_variable[i] +" ");
			i++;
		}
		System.out.println("===================4================");
		
		int multiDiArray[][] = new int[3][];
		multiDiArray[0] = new int[1];
		multiDiArray[1] = new int[2];
		multiDiArray[2] = new int[3];
		int sum = 0;
		for (int i = 0; i < multiDiArray.length; i++) 
			for (int j = 0; j < i+1; j++) 
				multiDiArray[i][j] = j+1;
				
		for (int i = 0; i < multiDiArray.length; i++) 
			for (int j = 0; j < i+1; j++) 
				sum += multiDiArray[i][j];
		System.out.println(sum);
		System.out.println("===================5================");
		
		int arr[] = new int[]{ 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		int n = 6;
		n = arr[arr[n]/2];
		System.out.println(arr[n]/2);
		System.out.println("===================6================");
		
		int[][] board = new int[3][3];
		for (int i = 0; i < board.length; i++) {       // Row Printing
			for (int j = 0; j < board.length; j++) {   // Column Printing
				board[i][j] = i+j;
			}
		}
		for (int[] is : board) {
			for (int i : is) {
				System.out.print(i + "\t");
			}
			System.out.println("\n");
		}
		System.out.println(Arrays.deepToString(board));
		
	}

}






