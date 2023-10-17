package com.java.Bitwise;

import java.util.Scanner;

public class RemoveLastSetBit {
	
	private static void remove(int n) {
          n=(n&(n-1));
          System.out.println("after removing last set bit is: "+n);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no");
		int n = scanner.nextInt();
		remove(n);
	}

}
