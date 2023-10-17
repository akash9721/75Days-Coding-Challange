package com.java.Bitwise;

public class NoOfFlipeedCovertAtoB {

	private static void flip(int a, int b) {
		int xor = (a ^ b);
		int cnt = 0;
		while (xor != 0) {
			xor = (xor & (xor - 1));
			cnt++;
		}
		System.out.println("No of bit to flip to convert a to b is: " + cnt);
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		flip(a, b);
	}

}
