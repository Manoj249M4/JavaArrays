package com.java.miscprograms;

public class ArrayFindMedian {

	public static void main(String[] args) {
		System.out.println(findMedian(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 }));
	}

	public static double findMedian(int[] nums1, int[] nums2) {

		double ans = 0;
		int len1 = nums1.length;
		int len2 = nums2.length;
		int[] arr = new int[len1 + len2];
		int i = 0, j = 0, k = 0;
		while (i < len1 && j < len2) {
			if (nums1[i] <= nums2[j]) {
				arr[k] = nums1[i];
				i++;
				k++;
			} else {
				arr[k] = nums2[j];
				k++;
				j++;
			}
		}
		while (i < len1) {
			arr[k] = nums1[i];
			i++;
			k++;
		}
		while (j < len2) {
			arr[k] = nums2[j];
			j++;
			k++;
		}
		int len = arr.length;
		if (len % 2 != 0) {
			ans = (double) arr[len / 2];
		} else {
			ans = (double) (arr[(len - 1) / 2] + arr[(len / 2)]) / 2;
		}
		return ans;
	}
}
