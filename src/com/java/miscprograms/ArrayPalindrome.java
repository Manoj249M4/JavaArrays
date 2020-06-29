package com.java.miscprograms;

import java.util.Scanner;

public class ArrayPalindrome {

	public static void main(String[] args) {
		int palindrome = new Scanner(System.in).nextInt();

		if (printPalindrome(palindrome)) {
			System.out.println("Number : " + palindrome + " is a palindrome");
		}else{
			System.out.println("Number : " + palindrome + " is not a palindrome");
		}
		
	}

	public static boolean printPalindrome(int number) {

		int palindrome = number;
		int reverse = 0;
		while (palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}
		if (number == reverse) {
			return true;
		}

		return false;
	}

}
