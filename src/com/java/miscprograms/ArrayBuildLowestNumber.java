package com.java.miscprograms;

/**
 * @author Manoj
 *
 */
public class ArrayBuildLowestNumber {

	static String res = " ";

	public static void main(String[] args) {
		String str = "121198";
		int n = 2;
		buildLowestNumberRec(str, n);
		System.out.println(res);
	}

	public static void buildLowestNumberRec(String str, int n) {
		// If there are 0 characters to remove from str,
		// append everything to result
		if (n == 0) {
			res.concat(str);
			return;
		}
		int len = str.length();
		// If there are more characters to
		// remove than string length,
		// then append nothing to result
		if (len <= n) {
			return;
		}
		int minIndex = 0;
		for (int i = 1; i <= n; i++) {
			if (str.charAt(i) < str.charAt(minIndex)) {
				minIndex = i;
			}
		}
		res += str.charAt(minIndex);
		String new_str = str.substring(minIndex + 1);
		buildLowestNumberRec(new_str, n - minIndex);
	}
}
