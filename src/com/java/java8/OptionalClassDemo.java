package com.java.java8;

import java.util.Optional;

public class OptionalClassDemo {

	public static void firstWay() {
		String str="akash";
		Optional<String> optional=Optional.of(str);
		if(optional.isPresent()) {
			System.out.println("the value of string is: "+str);
		}
		else {
			System.out.println("value is null");
		}
		
	}
	
	private static void secondWay() {
		String[] str=new String[10];
		Optional<String> optional=Optional.ofNullable(str[5]);
		if(optional.isPresent()) {
			String value=str[5];
			System.out.println(value);
		}
		else {
			System.out.println("string is null");
		}
		
	}
	public static void main(String[] args) {
		firstWay();
		secondWay();
	}

}
