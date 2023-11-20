package com.java.javaInterview;

import java.util.HashSet;
import java.util.Set;

public class CheckPanagram {
	
	private static boolean checkPanagram(String str) {
		Set<Character> set=new HashSet<>();
		str=str.toLowerCase();
		for(char ch:str.toCharArray()) {
			if(Character.isLetter(ch)) {
				set.add(ch);
			}
		}
		return set.size()==26;
	}
	
	public static void main(String[] args) {
		String str="The quick brown fox jumps over the lazy dog";
		System.out.println(checkPanagram(str));
	}

}
