package com.java.Bitwise;

import java.util.Scanner;

public class EvenOddNo {

	private static void check(int n) {
		int no = (n >> 1) << 1;
		if (no == n) {
			System.out.println("no is even");
		} else {
			System.out.println("no is odd");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		check(n);
	}

}
