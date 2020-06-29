package com.java.miscprograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRowsComparison {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (n <= 0) {
			System.out.println("Invalid input");
		}
		int[][] data = new int[n][4];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 4; j++) {
				data[i][j] = sc.nextInt();
			}
		}
		Object array[] = new Object[4];
		Object array1[] = new Object[4];
		int idx = 0;
		int idx1 = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 4; j++) {
				array[idx] = data[i][j];
				array1[idx1] = data[i+1][j];
				idx++;
				idx1++;
				if (Arrays.deepEquals(array, array1)) {
					System.out.println(i + " - " + j);
				} else {
					System.out.println("Not maching");
				}
			}
		}
		sc.close();
	}

}
