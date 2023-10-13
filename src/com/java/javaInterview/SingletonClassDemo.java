package com.java.javaInterview;

class Singleton{
	
	private static Singleton instancevariable=null;
	
	private Singleton() {
		System.out.println("singleton default constructor");
	}
	
	public static Singleton getInstance() {
		if(instancevariable==null) {
			instancevariable=new Singleton();
		}
		return instancevariable;
	}
}

public class SingletonClassDemo {
      public static void main(String[] args) {
    	  Singleton x=Singleton.getInstance();
    	  Singleton y=Singleton.getInstance();
    	  
    	  System.out.println(x.hashCode());
    	  System.out.println(y.hashCode());
    	  
    	  if(x==y) {
    		  System.out.println("\"Two objects point to the same memory location on the heap i.e, to the same object\"");
    	  }
    	  else {
    		  System.out.println("objects DO NOT point to the same memory location on the heap");
    	  }
	}
}
