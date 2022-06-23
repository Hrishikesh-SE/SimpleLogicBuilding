package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNumber {
	public static void main(String[] args) {
		// Initialize array
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.print("Enter the " + length + " elements of Array: ");
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("arr[] = " + Arrays.toString(arr));

		System.out.println("Duplicate elements in given array: ");
		// Searches for duplicate element
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
		sc.close();
	}
}