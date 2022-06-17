package com.java;

import java.util.Arrays;

public class SecondLargestInArray {
	public static void main(String[] args) {
		int arr[] = { 12, 35, 1, 10, 34, 1 };
		System.out.println("arr[] = " + Arrays.toString(arr));
		int count = 0, temp;
		for (int element : arr) {
			count++;
		}
		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted arr[] = " + Arrays.toString(arr));
		System.out.println("Second large number is " + arr[count - 2]);
	}
}