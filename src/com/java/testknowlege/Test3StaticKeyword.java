package com.java.testknowlege;

public class Test3StaticKeyword {

	public static int x = 5;
	
	public static void functionCall() {
		x = 15;
		System.out.print(x+" ");
	}

	public static void main(String[] args) {
		int x = 10;
		System.out.print(x + " ");
		functionCall();
		System.out.print(x + " ");
	}
}
