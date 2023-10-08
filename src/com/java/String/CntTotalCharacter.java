package com.java.String;

import java.util.Scanner;

public class CntTotalCharacter {
	
	private static void cntChar(String str) {
		int cnt=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch!=' ') {
				cnt++;
			}
		}
		System.out.println("No of character is "+cnt);
	}
	
    public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=scanner.nextLine();
		cntChar(str);
	}
}
