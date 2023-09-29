package com.java.Dsa;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepetedChar {
	
	private static void method1(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
				System.out.println("Non repeted character is:"+str.charAt(i));
				break;
			}
		}		
	}
	
	private static void method2(String str) {
		Map<Character, Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i), 1);
			}
		}
		for(int i=0;i<str.length();i++) {
			if(map.get(str.charAt(i))==1) {
				System.out.println("Non repeted character is:"+str.charAt(i));
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "stress";
		method1(str);
		method2(str);
	}
	
}
