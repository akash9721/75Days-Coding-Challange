package com.java.Bitwise;

import java.util.Scanner;

//no=5
//   1 0 1

//   2 1 0
// index start from 0 from right side

public class CheckithBitSetOrNot {

	private static void check(int no, int i) {
		int mask = (1 << i);
		int res = (mask & no);
		if (res != 0) {
			System.out.println(i + " bit is set");
		} else {
			System.out.println(i + " bit is not set");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		int x = sc.nextInt();
		System.out.println("enter ith bit");
		int y = sc.nextInt();
		check(x, y);
	}
}
