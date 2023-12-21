package com.java.Bitwise;

public class SwapEvenOddBits {

	private static void swapEvenOddBits(int n) {
		int even=(n&0xaaaaaaaa);
		int odd=(n&0x55555555);
		even>>=1;
		odd<<=1;
		System.out.println(even|odd);
	}
	
	public static void main(String[] args) {
		//input   10110110
		//output  01111001
		int n=182;
		swapEvenOddBits(n);
	}

}
