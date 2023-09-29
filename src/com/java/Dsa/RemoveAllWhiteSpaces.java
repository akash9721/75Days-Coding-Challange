package com.java.Dsa;

import java.util.Scanner;

public class RemoveAllWhiteSpaces {

	private static void removeAllWhiteSpaces(String str) {
        for(int i=0;i<str.length();i++) {
        	char ch=str.charAt(i);
        	if(ch!=' ') {
        		System.out.print(ch);
        	}
        }
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scanner.nextLine();
		removeAllWhiteSpaces(str);

	}
}
