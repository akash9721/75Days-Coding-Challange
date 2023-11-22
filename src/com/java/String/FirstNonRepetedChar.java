package com.java.String;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepetedChar {

	private static void method1(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
				System.out.println("Non repeted character is:" + str.charAt(i));
				break;
			}
		}
	}

	private static void method2(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if (map.get(str.charAt(i)) == 1) {
				System.out.println("Non repeted character is:" + str.charAt(i));
				break;
			}
		}
	}

	// abcdcaf
	private static void method3(String str) {
		for (int i = 0; i < str.length(); i++) {
			boolean flag = false;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println("index of non repting element is: " + i);
				break;
			}
		}
	}

	public static void main(String[] args) {
		String str = "abcdcaf";
		method1(str);
		method2(str);
		method3(str);
	}

}
