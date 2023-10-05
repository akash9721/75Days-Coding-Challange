package com.java.Array;

public class FindSecondThirdGreatestNo {

	private static void findLargest(int[] a) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}

	private static void findSecondThirdLargest(int[] a) {
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		int third=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>first) {
				third=second;
				second=first;
				first=a[i];
			}
			else if(a[i]>second && a[i]<first) {
				third=second;
				second=a[i];
			}
			else if(a[i]>third && a[i]<second) {
				third=a[i];
			}
		}
		System.out.println(first+" "+second+" "+third);
	}
	public static void main(String[] args) {
		int a[] = { 3, 9, 2, 5, 23, 80, 6, 70, 8, 1 };
		findLargest(a);
		findSecondThirdLargest(a);
	}
}
