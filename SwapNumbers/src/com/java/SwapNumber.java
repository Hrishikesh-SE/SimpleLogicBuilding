package com.java;

public class SwapNumber {
	public static void main(String[] args) {
		int a = 10, b = 12;
		System.out.println("Befor Swaping Values:");
		System.out.println("a = "+a+", b = "+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swaping Values:");
		System.out.println("a = "+a+", b = "+b);
	}
}