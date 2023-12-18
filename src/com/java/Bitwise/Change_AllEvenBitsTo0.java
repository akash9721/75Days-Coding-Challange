package com.java.Bitwise;

public class Change_AllEvenBitsTo0 {

	public static int convert(int n) {
		return (n & 0xaaaaaaaa);
	}
	public static void main(String[] args) {
		int n=30;
		System.out.println("after changing value is "+convert(n));
	}
}
