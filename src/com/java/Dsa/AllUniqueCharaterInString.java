package com.java.Dsa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AllUniqueCharaterInString {
	
	private static boolean allUnique(String str) {
		str=str.replaceAll("\\s","");
        Set<Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++) {
        	if(!set.add(str.charAt(i))) {
        		return false;
        	}
        }
        return true;
	}
	
	private static boolean usingSortMethod(String str) {
		str=str.replaceAll("\\s","");
		char[] arr=str.toCharArray();
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1]) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean usingIndexOfMethod(String str) {
		str=str.replaceAll("\\s","");
		boolean result=false;
		for(char ch:str.toCharArray()) {
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				result=true;
			}
			else {
				result=false;
				break;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		//1.method
		System.out.println(allUnique(str));
		//2.method
		System.out.println(usingSortMethod(str));
		//3.method
		System.out.println(usingIndexOfMethod(str));
	}
}
