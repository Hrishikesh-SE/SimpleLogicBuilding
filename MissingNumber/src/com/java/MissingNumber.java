package com.java;

import java.util.Arrays;

public class MissingNumber {
	public static int findMissingNumbers(int[] nums) {
		int n = nums.length;
		int sum = ((n + 1) * (n + 2)) / 2;
		for (int i = 0; i < n; i++)
			sum -= nums[i];
		return sum;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 6 };
		System.out.println("a[] = " + Arrays.toString(a));
		System.out.println("Missing value is "+findMissingNumbers(a));
	}
}