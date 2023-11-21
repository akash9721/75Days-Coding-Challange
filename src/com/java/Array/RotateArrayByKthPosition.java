package com.java.Array;

import java.util.Scanner;

public class RotateArrayByKthPosition {
	
	private static void revarr(int[] arr, int i, int j) {
		int l=i;
		int r=j;
		while(l<=r) {
			int temp=arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			
			l++;
			r--;
		}
	}
	
	private static void rotate(int[] arr, int n, int k) {
		k = k % n;
		revarr(arr, 0, n - k - 1);
		revarr(arr, n - k, n - 1);
		revarr(arr, 0, n - 1);
	}


	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter position");
		int k = scanner.nextInt();
		rotate(arr, n, k);
		
		for(int xx:arr) {
			System.out.print(xx+" ");
		}
	}
}
