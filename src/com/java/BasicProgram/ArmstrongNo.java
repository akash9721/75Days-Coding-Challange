package com.java.BasicProgram;

import java.util.Scanner;

public class ArmstrongNo {
	private static void armstrongNo(int n) {
		int res=0;
		int num=n;
		while(n!=0) {
			int rem=n%10;
			res=res+(rem*rem*rem);
			n/=10;
		}
		String str= (num==res)?"Armstrng No":"Not armstrong no";
		System.out.println(str);
	}
	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number");//153
         int n=sc.nextInt();
         armstrongNo(n);
	}

}
