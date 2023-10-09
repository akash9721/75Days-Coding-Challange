package com.java.String;

import java.util.Scanner;

public class SubstringOfString {

	private static void subString(String input) {
		int n=input.length();
       for(int i=0;i<n;i++) {
    	   for(int j=i;j<=n;j++) {
    		   System.out.print(input.substring(i,j)+" ");
    	   }
       }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = sc.nextLine();
		subString(input);
	}
}
