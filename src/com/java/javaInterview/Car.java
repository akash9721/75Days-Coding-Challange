package com.java.javaInterview;

import java.io.Serializable;

public class Car implements Cloneable,Serializable{

	String color;
	
	public Car() {	
		System.out.println("constructure is called");
	}

	public String getColor() {
		return color;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [color=" + color +"]";
	}
	
	
}
