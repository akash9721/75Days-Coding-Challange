package com.java.java8;

import java.util.Optional;

public class OptionalClassDemo {

	public static void main(String[] args) {
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
}
