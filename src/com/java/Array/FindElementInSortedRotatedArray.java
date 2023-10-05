package com.java.Array;

public class FindElementInSortedRotatedArray {

	private static int findElement(int[] arr, int n, int element) {
          int low=0;
          int end=n;
          while(low<=end) {
        	  int mid=(low+end)/2;
        	  
        	  if(arr[mid]==element)
        		  return mid;
        	  if(arr[mid]<=arr[end]) {
        		  if(element>arr[mid] && element<=arr[end]) {
        			  low=mid+1;
        		  }
        		  else {
        			  end=mid-1;
        		  }
        	  }
        	  else {
        		  if(element>=arr[low] && element<arr[mid]) {
        			  end=mid-1;
        		  }
        		  else {
        			  low=mid+1;
        		  }
        	  }
          }
          return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 16, 19, 21, 25, 3, 5, 8, 10 };
		int n = arr.length;
		int element = 5;
		System.out.println("Index of element is: "+findElement(arr, n-1, element));

	}
}
