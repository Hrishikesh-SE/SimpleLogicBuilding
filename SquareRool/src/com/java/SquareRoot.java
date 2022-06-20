package com.java;

import java.util.Scanner;

public class SquareRoot {
	// sqrtn+1=(sqrtn+(num/sqrtn))/2
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long a = sc.nextLong();
		System.out.println("The square root of " + a + " is: " + SquareRoot(a));
		sc.close();
	}

	public static double SquareRoot(long num) {
		double temp;
		double sqrt = num / 2;
		do {
			temp = sqrt;
			sqrt = (temp + (num / temp)) / 2;
		} while ((temp - sqrt) != 0);
		return sqrt;
	}
}