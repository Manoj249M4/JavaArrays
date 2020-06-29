package com.java.miscprograms;

public class SumOfDigitsOfNumberUptoSingleDigit {

	public static void main(String[] args) {
		System.out.println(digSum(1234));
	}

	static int digSum(int n) {
		int sum = 0;
		while (n > 0 || sum > 9) {
			if (n == 0) {
				n = sum;
				sum = 0;
			}
			sum = sum + (n % 10);
			n = n / 10;
		}
		return sum;
	}
}
