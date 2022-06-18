package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class FindEven {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.print("Enter the " + length + " elements of Array: ");
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("arr[] = " + Arrays.toString(arr));
		System.out.print("Even numbers of array are: ");
		for (int element : arr) {
			if (element % 2 == 0)
				System.out.print(" "+element);
		}
		sc.close();
	}
}