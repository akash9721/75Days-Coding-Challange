package com.java.java8;

interface I1 {
	public default void display() {
		System.out.println("display of I1 method");
	}	
	
	public static void show() {
		System.out.println("static show method");
	}
	
}


public class InterfaceStaticMethodDemo implements I1{

	@Override
	public void display() {
		
		System.out.println("display of override method");
	}

	public static void show() {
		System.out.println("main show method");
	}
	
	public static void main(String[] args) {
		
		InterfaceStaticMethodDemo obj=new InterfaceStaticMethodDemo();
		obj.display();
		I1.show();
		show(); //visibility of show method is within method only
	}
}
