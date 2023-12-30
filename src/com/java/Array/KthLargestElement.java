package com.java.Array;

import java.util.PriorityQueue;

public class KthLargestElement {

	private static void maxHeap(int[] a,int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<a.length;i++) {
			pq.add(a[i]);
			
			if(pq.size()>k)
				pq.poll();
		}
		System.out.println(k+"th largest element is :"+pq.peek());
	}
	
	public static void main(String[] args) {
		int a[]= {10,50,20,1,15,9};
		int k=4;
		maxHeap(a,k);
	}
}
