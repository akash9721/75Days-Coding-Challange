package com.java.Dsa;

public class QuickSort {
	
	public static int partition(int a[], int l, int h) {
		int i = l;
		int j = h;
		int pivot = a[l];
		while (i < j) {
			while (a[i] <= pivot)
				i++;
			while (a[j] > pivot)
				j--;
			if (i < j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[j];
		a[j] = a[l];
		a[l] = temp;
		return j;

	}
	
	public static void quicksort(int a[], int l, int h) {
		if (l <= h) {
			int p = partition(a, l, h);
			quicksort(a, l, p - 1);
			quicksort(a, p + 1, h);
		}
	}
	
	private static void printArray(int[] arr) {
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}
	
	public static void main(String[] args) {
		int arr[] = { 40, 23, 4, 12, 35, 7, 9, 1,2,90};
		int n=arr.length;
		System.out.println("Given array is");
		printArray(arr);
       
		quicksort(arr,0,n-1);
		System.out.println("\nAfter sorted array");
		printArray(arr);
	}
}
