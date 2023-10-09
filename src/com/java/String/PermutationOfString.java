package com.java.String;

import java.util.Scanner;

public class PermutationOfString {
	private static void permute(String str, int l, int r) {
            if(l==r) {
            	System.out.print(str+" ");
            }
            else {
            	for(int i=l;i<=r;i++) {
            		str= swap(str,l,i);
            		permute(str, l+1, r);
            		str= swap(str,l,i);
            	}
            }
	}

	private static String swap(String str, int l, int i) {
		char temp;
		char[] arr=str.toCharArray();
		temp=arr[l];
		arr[l]=arr[i];
		arr[i]=temp;
		
		return String.valueOf(arr);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		permute(str, 0, str.length() - 1);
	}

}
