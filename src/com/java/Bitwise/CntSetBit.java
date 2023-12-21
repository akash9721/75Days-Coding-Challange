package com.java.Bitwise;

public class CntSetBit {
    
	private static void method2(int n) {
		int cnt = 0;
		while (n!=0) {
			int rem=n % 2;
			if (rem==1) 
				cnt++;
			n=n/2;
		}
		System.out.println("No of set bit is: "+cnt);
	}

	private static void method1(int num) {
		int cnt = 0;
		while (num != 0) {
			num = (num) & (num - 1);
			cnt++;
		}
		System.out.println("No of set bit is: " + cnt);
	}

	public static void main(String[] args) {
		int num = 19;
		method1(num);
		System.out.println();
		method2(num);
	}

}
