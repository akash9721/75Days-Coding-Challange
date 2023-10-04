package com.java.Dsa;

public class FindMissingNo {
	
	private static void swap(int[] a, int i, int j) {
		int temp=i;
		i=j;
		j=temp;
	}
	
	private static int findMissingNo(int[] a, int n) {
		int i=0;
		while(i<n) {
			if(a[i]<n && a[i]!=a[a[i]-1]) {
				swap(a,a[i],a[a[i]-1]);
			}
			else {
				i++;
			}
		}
		for(int x=0;x<a.length;x++) {
			if(a[x]!=x+1) {
				return x+1;
			}
		}
		return a.length;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5 };
		int n=arr.length;
		System.out.println("Missing No is:"+findMissingNo(arr,n));
	}
}
