package com.java.testknowlege;

class MyTest1 {

	int x;

	public int getX() {
		return x;
	}

	public void setX(int val) {
		x = val;
	}
		
}

public class Test1{
	public static void main(String[] args) {
		MyTest1 obj=new MyTest1();
		obj.setX(5);
		System.out.println(obj.getX());
	}
}


