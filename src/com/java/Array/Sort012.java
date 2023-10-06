package com.java.Array;

public class Sort012 {

	private static void method1(int[] arr) {
		int zero = 0, one = 0, two = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				zero++;
			else if (arr[i] == 1)
				one++;
			else
				two++;
		}

		for (int i = 0; i < zero; i++) {
			arr[i] = 0;
		}
		for (int j = zero; j < zero + one; j++) {
			arr[j] = 1;
		}
		for (int k = zero + one; k < zero + one + two; k++) {
			arr[k] = 2;
		}

		System.out.println("Sorted array is");
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}


	private static void swap(int[] arr, int i, int j) {
		int temp=i;
		i=j;
		j=temp;
	}
	
	private static void method2(int[] arr) {
		int low=0,mid=0,high=arr.length-1;
		while(mid<high) {
			if(arr[mid]==0) {
				swap(arr,arr[mid],arr[low]);
				low++;
				mid++;
			}
			else if(arr[mid]==1) {
				mid++;
			}
			else {
				swap(arr, arr[mid],arr[high]);
				high--;
			}
		}
		
		System.out.println("\nUsing another method");
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 0, 2, 1, 2, 0 };
		method1(arr);
		method2(arr);
	}

}
