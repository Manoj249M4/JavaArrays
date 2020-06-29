package com.java.miscprograms;

public class ArraySumOfBothDiagonals {

	public static void main(String[] args) {
		int rows = 0;
		int columns = 0;

		int[][] matrix = new int[4][4];
		for (rows = 0; rows < matrix.length; rows++) {
			for (columns = 0; columns < matrix[rows].length; columns++) {
				matrix[rows][columns] = rows + columns + 1;
				System.out.print(matrix[rows][columns] + " ");
			}
			System.out.println(" ");
		}

		for (int[] a : matrix) {
			for (int i : a) {
				System.out.print(i + "\t");
			}
			System.out.println("\n");
		}

		int sumOfDiagonal_1 = 0;
		for (int i = 0, j = 0; i < rows && j < columns; i++, j++) {
			sumOfDiagonal_1 = sumOfDiagonal_1 + matrix[i][j];
		}

		int sumOfDiagonal_2 = 0;
		for (int i = 0, j = columns - 1; i < rows && j >= 0; i++, j--) {
			sumOfDiagonal_2 = sumOfDiagonal_2 + matrix[i][j];
		}

		System.out.println(
				"sum of diagonal1 elements= " + sumOfDiagonal_1 + ", sum of diagonal2 elements = " + sumOfDiagonal_2);
		System.out.println("sum of diagonal1 and diagonal2 elements is : " + (sumOfDiagonal_1 + sumOfDiagonal_2));

	}

}
