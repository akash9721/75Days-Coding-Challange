package com.java.Dsa;

import java.util.Arrays;

public class AnagramString {
	private static void method1(String str1, String str2) {
		str1=str1.replaceAll("\\s", "").toLowerCase();
		str2=str2.replaceAll("\\s", "").toLowerCase();
		boolean result=false;
		if(str1.length()!=str2.length()) {
			result=false;
		}
		else {
			char[] ch1=str1.toCharArray();
			char[] ch2=str2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			result=Arrays.equals(ch1, ch2);
		}
	   String str= result?"anagram":"Not anagram";
	   System.out.println(str);
	}
	
	private static void method2(String str1, String str2) {
		
	}
	
    public static void main(String[] args) {
		String str1="silent";
		String str2="Listeni";
		method1(str1,str2);
		method2(str1,str2);
	}
}
