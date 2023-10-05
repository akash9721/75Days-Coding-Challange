package com.java.Array;

public class MinimumElementInSortedRotated {
	
	private static int findMinimum(int[] arr, int n, int element) {
		int low=0;
		int high=n;
		while(low<high) {
			int mid=(low+high)/2;
			if(arr[mid]>arr[high]) {
				low=mid+1;
			}
			else {
				high=mid;
			}
		}
		return arr[low];
	}
	
	public static void main(String[] args) {
		int arr[] = { 16, 19, 21, 25, 3, 5, 8, 10 };
		int n = arr.length;
		int element = 5;
		System.out.println("Minimum element is: "+findMinimum(arr, n-1, element));
	}

}
