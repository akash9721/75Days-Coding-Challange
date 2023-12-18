package com.java.Bitwise;

import java.util.Scanner;

//if no is 0 or apper more than once then it return -1
public class PositionOfOnlySetBit {
	  public static int method1(int n) {
		  if(n==0)
			  return -1;
		  if((n & n-1)==0) {
			  int cnt=0;
			  while(n!=0) {  //n=4 100
				  cnt++;    // n>>1 10
				  n>>=1;    // n>>1  1
			  }
			  return cnt;
		  }
		  return -1;
	  }
	  
	  public static int method2(int n) {
		  if(n==0)
			  return -1;
		  if((n & n-1)==0) {
			 int cnt=(int)Math.log(n)+1;
			 return cnt;
		  }
		  return -1;
	  }
	  
      public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int n=sc.nextInt();
		System.out.println("position of set cnt bit "+method1(n));
		System.out.println("position of set cnt bit "+method2(n));
	}
}
