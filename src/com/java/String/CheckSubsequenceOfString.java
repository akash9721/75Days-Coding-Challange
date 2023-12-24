package com.java.String;

import java.util.Scanner;

public class CheckSubsequenceOfString {

	public static boolean checkSubsequence(String str1,String str2) {
		if(str1.length()==0)
			return false;
		if(str2.length()==0)
			return false;
		int j=0;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)==str2.charAt(j)) {
				j++;
			}
		}
		return j==str2.length();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		String str1=sc.nextLine();
		System.out.println("Enter second string");
		String str2=sc.nextLine();
		//xabcydez
		//xyz
		String res= checkSubsequence(str1,str2)?str2+ " is subsequence of "+str1:"not subsequence";
		System.out.println(res);
	}
}
