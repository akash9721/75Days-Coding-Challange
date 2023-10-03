package com.java.BasicProgram;

import java.util.Scanner;

public class FibonacciNo {
	
	private static void fibonacciUpToN(int num) {
		int first=0;
		int second=1;
		for(int i=1;i<=num;i++) {
			System.out.print(first+" ");
			int third=first+second;
			first=second;
			second=third;
		}
	}
	
	private static int findNthFibonacci(int num) {
		while(num<=1)
			return num;
		return findNthFibonacci(num-1)+findNthFibonacci(num-2);
	}
	public static void main(String[] args) {
          Scanner scanner=new Scanner(System.in);
          System.out.println("Enter First No");
          int num=scanner.nextInt();
          fibonacciUpToN(num);
          System.out.println();
          System.out.println(findNthFibonacci(num-1));
	}

}
