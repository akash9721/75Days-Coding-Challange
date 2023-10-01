package com.java.Dsa;

public class MergeSort {

	private static void merge(int[] arr, int mid, int l, int r) {
		int n1=mid-l+1;
		int n2=r-mid;
		
		int left[]=new int[n1];
		int right[]=new int[n2];
		
		for(int i=0;i<n1;i++) {
			left[i]=arr[i+l];
		}
		
		for(int j=0;j<n2;j++) {
			right[j]=arr[mid+1+j];
		}
		
		int i=0,j=0;
		int k=l;
		while(i<n1 && j<n2) {
			if(left[i]<=right[j]) {
				arr[k++]=left[i++];
			}
			else {
				arr[k++]=right[j++];
			}
		}
		while(i<n1) {
			arr[k++]=left[i++];
		}
		while(j<n2) {
			arr[k++]=right[j++];
		}
	}
	
	private static void mergeSort(int[] arr, int l, int r) {
		 if(l<r) {
			 int mid=(l+r)/2;
			 mergeSort(arr, l, mid);
			 mergeSort(arr, mid+1, r);
			 merge(arr, mid, l, r);
		 }
	}
	
	private static void printArray(int[] arr) {
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 40, 23, 4, 12, 35, 7, 9, 1, 2 };
		System.out.println("Given array is");
		printArray(arr);
		
		mergeSort(arr,0,arr.length-1);
		System.out.println("\nAfter sorted array");
		printArray(arr);
	}
}
