package com.java.miscprograms;

/*Given a matrix, find the path from top left to bottom right with the greatest
  product by moving only down and right.*/
public class ArrayMatrixProduct {

	public static void main(String[] args) {
		int[][] arr = new int[][]{{ 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }};
		System.out.println(matrixProduct(arr));
	}

	public static int matrixProduct(int[][] matrix) {
		
			 /* [ 1 , 2 , 3 ]
				[ 4 , 5 , 6 ]
				[ 7 , 8 , 9 ]
				1 -> 4 -> 7 -> 8 -> 9 = 2016 */
				
		int[][] maxCache = new int[matrix.length][matrix[0].length];
		int[][] minCache = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				int maxVal = Integer.MIN_VALUE;
				int minVal = Integer.MAX_VALUE;
				if (i == 0 && j == 0) {
					maxVal = matrix[i][j];
					minVal = matrix[i][j];
				}
				if (i > 0) {
					int tempMax = Math.max(matrix[i][j] * maxCache[i - 1][j], matrix[i][j] * minCache[i - 1][j]);
					maxVal = Math.max(tempMax, maxVal);
					int tempMin = Math.min(matrix[i][j] * maxCache[i - 1][j], matrix[i][j] * minCache[i - 1][j]);
					minVal = Math.min(tempMin, minVal);
				}
				if (j > 0) {
					int tempMax = Math.max(matrix[i][j] * maxCache[i][j - 1], matrix[i][j] * minCache[i][j - 1]);
					maxVal = Math.max(tempMax, maxVal);
					int tempMin = Math.min(matrix[i][j] * maxCache[i][j - 1], matrix[i][j] * minCache[i][j - 1]);
					minVal = Math.min(tempMin, minVal);
				}
				maxCache[i][j] = maxVal;
				minCache[i][j] = minVal;
			}
		}

		return maxCache[maxCache.length - 1][maxCache[0].length - 1];
	}

}
