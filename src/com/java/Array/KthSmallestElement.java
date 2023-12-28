package com.java.Array;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {

	private static void maxHeap(int[] a,int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<a.length;i++) {
			pq.add(a[i]);
			
			if(pq.size()>k)
				pq.poll();
		}
		System.out.println(k+"th smallest element is :"+pq.peek());
	}
	
	public static void main(String[] args) {
		int a[]= {10,50,20,1,15,9};
		int k=3;
		maxHeap(a,k);
	}
}
