package com.java.miscprograms;

public class ArrayRotateMatrix {

	public static void main(String args[]) {
		int[][] matrix = new int[3][3];
		initializeMatrix(matrix, 3);
		System.out.println("Input: ");
		printMatrix(matrix, 3);
		rotate(matrix, 3);
		printMatrix(matrix, 3);
	}

	public static void rotate(int[][] matrix, int n) {
		for (int layer = 0; layer < n / 2; ++layer) {
	        int first = layer;
	        int last = n - 1 - layer;
	        for(int i = first; i < last; ++i) {
	            int offset = i - first;
	            int top = matrix[first][i]; // save top

	            // left -> top
	            matrix[first][i] = matrix[last-offset][first];          

	            // bottom -> left
	            matrix[last-offset][first] = matrix[last][last - offset]; 

	            // right -> bottom
	            matrix[last][last - offset] = matrix[i][last]; 

	            // top -> right
	            matrix[i][last] = top; // right <- saved top
	        }
	    }
	}

	public static void printMatrix(int[][] matrix, int n) {
		System.out.print("\n");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" " + matrix[i][j]);
			}
			System.out.print("\n");
		}
	}

	public static void initializeMatrix(int[][] matrix, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = (int) (Math.random() * 10);
			}
		}
	}

}
