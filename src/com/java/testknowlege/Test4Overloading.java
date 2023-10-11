package com.java.testknowlege;

public class Test4Overloading {
	
	   public void print(Integer i) {
		   System.out.println("Integer");
	   }
	   
	   public void print(int... i) {
		   System.out.println("int");
	   }
	   
	   public void print(long l) {
		   System.out.println("long");
	   }
	   
	   public void print(short s) {
		   System.out.println("short");
	   }
	   
       public static void main(String[] args) {
		Test4Overloading t=new Test4Overloading();
		t.print(10);
	}
}
