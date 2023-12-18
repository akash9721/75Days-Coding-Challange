package com.java.Bitwise;

public class SwapTwoNibble {

	public static int swapNibbles(int n) {
		return (((0x0F & n)<<4) | ((0xF0 & n)>>4));
	}
	public static void main(String[] args) {
		int n=100;
		System.out.println("after swapping value is:"+swapNibbles(n));
	}
}


// ex 0110 0100 (100)
// to 0100 0110 (70)