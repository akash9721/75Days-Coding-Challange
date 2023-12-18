package com.java.Bitwise;

import java.util.Scanner;

//check given no is power of 2
public class PowerOf2 {

	public static boolean checkPower(int n) {
		if (n == 0)
			return false;
		while (n != 1) {
			if (n % 2 == 0) {
				n /= 2;
			} else {
				return false;
			}
		}
		return true;
	}

	public static boolean checkPower2(int n) {
		if(n==0)
			return false;
		if((n&n-1)==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any no");
		int n = sc.nextInt();
		System.out.println(checkPower(n));
		System.out.println();
		System.out.println(checkPower2(n));
	}
}
