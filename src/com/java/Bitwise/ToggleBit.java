package com.java.Bitwise;

public class ToggleBit {
       public static void main(String[] args) {
		int n=5;
		int i=2;
		toggle(n,i);
	}

	private static void toggle(int n, int i) {
		int mask=(1<<i-1);
		System.out.println("after flippping no is: "+(mask^n));
	}
}
