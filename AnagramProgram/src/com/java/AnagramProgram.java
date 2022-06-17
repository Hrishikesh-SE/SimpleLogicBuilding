package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First String: ");
		String str1 = sc.nextLine();// India is my country
		System.out.print("Enter Second String: ");
		String str2 = sc.nextLine();// Amii Conny surdity
		if (isAnagram(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are Anagrams");
		} else {
			System.out.println(str1 + " and " + str2 + " are NOT Anagrams");
		}
		sc.close();
	}

	static boolean isAnagram(String str1, String str2) {
		// remove white spaces
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		// Check if both length matches
		if (s1.length() != s2.length()) {
			return false;
		} else {
			char[] arr1 = s1.toLowerCase().toCharArray();
			char[] arr2 = s2.toLowerCase().toCharArray();
			// Arrays.sort(arr1);
			// sorting array 1
			int count = 0;
			char temp;
			for (int element : arr1) {
				count++;
			}
			for (int i = 0; i < count; i++) {
				for (int j = i + 1; j < count; j++) {
					if (arr1[i] > arr1[j]) {
						temp = arr1[i];
						arr1[i] = arr1[j];
						arr1[j] = temp;
					}
				}
			}
			// Arrays.sort(arr2);
			// sorting array 2
			count = 0;
			for (int element : arr2) {
				count++;
			}
			for (int i = 0; i < count; i++) {
				for (int j = i + 1; j < count; j++) {
					if (arr2[i] > arr2[j]) {
						temp = arr2[i];
						arr2[i] = arr2[j];
						arr2[j] = temp;
					}
				}
			}
			return Arrays.equals(arr1, arr2);
		}
	}
}