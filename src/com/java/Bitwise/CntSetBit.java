package com.java.Bitwise;

public class CntSetBit {

	public static void main(String[] args) {
		int num=19;
		cnt(num);
	}

	private static void cnt(int num) {
		int cnt=0;
		while(num!=0) {
			num=(num)&(num-1);
			cnt++;
		}
		System.out.println("No of set bit is: "+cnt);
	}
}
