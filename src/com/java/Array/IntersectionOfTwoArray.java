package com.java.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArray {
    
	private static void method1(int[] arr1, int[] arr2, int m, int n) {
		Set<Integer> set=new HashSet<>();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i=0,j=0;
		while(i<m && j<n) {
			if(arr1[i]<arr2[j]) {
				i++;
			}
			else if(arr1[i]>arr2[j]) {
				j++;
			}
			else {
				set.add(arr1[i]);
				i++;
				j++;
			}
		}
		while(i<m) {
			i++;
		}
		while(j<n) {
			j++;
		}
		
		System.out.println("using sort method");
		set.stream().forEach(x->System.out.print(x+" "));
	}

	private static void method2(int[] arr1, int[] arr2, int m, int n) {
		Set<Integer> set=new HashSet<>();
		Set<Integer> result=new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		
		for(int j=0;j<arr2.length;j++) {
			if(set.contains(arr2[j])) {
				result.add(arr2[j]);
			}
		}
		
		System.out.println("\nusing hashmap");
		result.stream().forEach(x->System.out.print(x+" "));
	}
	
	public static void main(String[] args) {
		 int[] arr1 = {7, 1, 5, 2, 3, 6};
	     int[] arr2 = {3, 8, 6, 20, 7};
	     int m=arr1.length;
	     int n=arr2.length;
	     method1(arr1,arr2,m,n);
	     method2(arr1,arr2,m,n);
	}
}
