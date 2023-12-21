package com.java.Bitwise;

import java.util.Scanner;

public class ClearithBit {
	
	private static void clear(int num, int i) {
		//index start from 0
		int mask=~(1<<(i));
		System.out.println("after clear ith  bit is :"+(num&mask));
		
	}
	
	private static void clear2(int num, int i) {
		int mask=(1<<i);
		System.out.println("after clear ith  bit is "+(mask^num));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		int x = sc.nextInt();
		System.out.println("enter ith bit");
		int y = sc.nextInt();
		clear(x, y);
		clear2(x,y);
	}
}
