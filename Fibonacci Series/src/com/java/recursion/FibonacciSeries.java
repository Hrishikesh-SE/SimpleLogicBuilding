package com.java.recursion;

import java.util.Scanner;

public class FibonacciSeries {
	static int n1 = 0, n2 = 1, n3 = 0;

	static void printFibonacci(int length) {
		if (length > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			printFibonacci(length - 1);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to get Fibonacci Series: ");
		int length = sc.nextInt();
		System.out.println("Fibonacci Series:");
		System.out.print(n1 + " " + n2);// printing 0 and 1
		printFibonacci(length - 2);// n-2 because 2 numbers are already printed
		sc.close();
	}
}