package com.java.BasicProgram;

import java.util.Scanner;

public class FactorialNo {

	private static void method1(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
	
	private static int method2(int n) {
		if(n==1)
			return n;
		return n*method2(n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		int n = sc.nextInt();
		System.out.println("using iterative");
		method1(n);
		System.out.println("\nusing recursion");
		System.out.println(method2(n));
	}
}
