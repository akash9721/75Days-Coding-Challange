package com.java.java8;

interface Interface1{
	
	public void square();
	public default void Display() {
		System.out.println("display of interface 1");
	}
}

interface Interface2{

	public void qube();
	public default void Display() {
		System.out.println("display of interface 2");
	}
	
}

public class InterfaceDefaultMethodDemo implements Interface1,Interface2{

	@Override
	public void square() {
		
	}
	
	@Override
	public void qube() {
		
	}

	@Override
	public void Display() {
		Interface2.super.Display();
	}

	public static void main(String[] args) {
		
		InterfaceDefaultMethodDemo idemo=new InterfaceDefaultMethodDemo();
		idemo.square();
		idemo.Display();
	}

}

