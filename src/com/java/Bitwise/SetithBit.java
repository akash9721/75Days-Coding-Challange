package com.java.Bitwise;

import java.util.Scanner;

public class SetithBit {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		int x = sc.nextInt();
		System.out.println("enter ith bit");
		int y = sc.nextInt();
		set(x, y);
	}

	private static void set(int num, int i) {
		int mask=(1<<i);
		System.out.println("ith set bit is "+(mask | num));
	}
}
