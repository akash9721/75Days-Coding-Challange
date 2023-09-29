package com.java.Dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UnionOfTwoArray {

	private static void method1(int[] arr1, int[] arr2, int m, int n) {
		List<Integer> list=new ArrayList<>();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i=0,j=0,k=0;
		while(i<m && j<n) {
			if(arr1[i]<arr2[j]) {
				list.add(arr1[i++]);
			}
			else if(arr1[i]>arr2[j]){
				list.add(arr2[j++]);
			}
			else {
				list.add(arr1[i]);
				i++;
				j++;
			}
		}
		while(i<m) {
		     list.add(arr1[i++]);
		}
		while(j<n) {
			 list.add(arr2[j++]);
		}
		System.out.println("using sort method");
		for(Integer x:list) {
			System.out.print(x+" ");
		}
	}
	
	private static void method2(int[] arr1, int[] arr2, int m, int n) {
		Set<Integer> set=new LinkedHashSet<>();
		//hashset not follow insertion order 
		//linkedhashset follow insertion order
		for(int x:arr1) {
			set.add(x);
		}
		for(int y:arr2) {
			set.add(y);
		}
		System.out.println("\nusing Linked hashset");
		set.stream().forEach(x->System.out.print(x+" "));
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
