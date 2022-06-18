package com.java.getArrayByUser;

import java.util.Scanner;

public class SecondLargestInArray {
	public static void main(String[] args) {
		int[] arr = new int[10];
		System.out.print("Enter length of Array: ");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		System.out.print("Enter the " + length + " elements of Array: ");
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		int temp;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Second large number is " + arr[length - 2]);
	}
}