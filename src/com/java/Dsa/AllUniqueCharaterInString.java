package com.java.Dsa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AllUniqueCharaterInString {
	
	private static boolean allUnique(String str) {
		str=str.replaceAll("\\s","");
		System.out.println(str);
        Set<Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++) {
        	if(!set.add(str.charAt(i))) {
        		return false;
        	}
        }
        return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		System.out.println(allUnique(str));
	}
}
