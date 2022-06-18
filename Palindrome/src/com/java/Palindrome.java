package com.java;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		String original, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string/number to check if it is a palindrome: ");
		original = sc.nextLine();
		// int length = original.length();
		int length = 0;
		// count string length
		for (char c : original.toCharArray())
			length++;
		// reverse string
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		if (original.toLowerCase().equals(reverse.toLowerCase()))
			System.out.println("Entered string/number is a palindrome.");
		else
			System.out.println("Entered string/number isn't a palindrome.");
		sc.close();
	}
}