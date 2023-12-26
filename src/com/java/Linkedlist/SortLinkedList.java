package com.java.Linkedlist;

class LLNode{
	int data;
	LLNode next;
	
	public LLNode() {
	}
	
	public LLNode(int data) {
		this.data = data;
	}	
	
	public LLNode(int data, LLNode next) {
		this.data = data;
		this.next = next;
	}	
}
public class SortLinkedList {
	
	public static LLNode findMid(LLNode head) {
		if(head==null || head.next==null)
			return head;
		LLNode slow=head;
		LLNode fast=head.next;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	
	public static LLNode merge(LLNode left,LLNode right) {
		if(left==null)
			return right;
		if(right==null)
			return left;
		
		LLNode dummy=new LLNode(-1);
		LLNode tra=dummy;
		
		while(left!=null && right!=null) {
			if(left.data<=right.data) {
				tra.next=left;
				left=left.next;
				tra=tra.next;
			}
			else {
				tra.next=right;
				right=right.next;
				tra=tra.next;
			}
		}
		while(left!=null) {
			tra.next=left;
			left=left.next;
			tra=tra.next;
		}
		while(right!=null) {
			tra.next=right;
			right=right.next;
			tra=tra.next;
		}
		return dummy.next;
	}
	
	public static LLNode mergeSort(LLNode head) {
		if(head==null || head.next==null)
			return head;
		LLNode mid=findMid(head);
		
		LLNode left=head;
		LLNode right=mid.next;
		mid.next=null;
		
		left=mergeSort(left);
		right=mergeSort(right);
		
		LLNode ans= merge(left,right);
		return ans;
	}
	
	public static void printData(LLNode head) {
		LLNode curr=head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
	
	public static void main(String[] args) {
       LLNode head=new LLNode(10);
       head.next=new LLNode(2);
       head.next.next=new LLNode(34);
       head.next.next.next=new LLNode(9);
       head.next.next.next.next=new LLNode(1);
       System.out.println("before sorted ");
       printData(head);
       LLNode sortedData=mergeSort(head);
       System.out.println("\nafter sorted ");
       printData(sortedData);
	}
}
