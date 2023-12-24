
package com.java.Linkedlist;

import java.util.HashSet;
import java.util.Set;

class Node {
	int data;
	Node next;

	public Node() {

	}

	public Node(int data) {
		this.data = data;
	}

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

}

public class LinkedListCycle {
	
	private static boolean detectCycle(Node head) {
		Node slow=head;
		Node fast=head;
		
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
				return true;
		}
		return false;
	}
	
	private static boolean detectCycle2(Node head) {
		Node curr=head;
		Set<Node> set=new HashSet<>();
		while(curr!=null) {
			if(set.contains(curr)) {
				return true;
			}
			
			set.add(curr);
			curr=curr.next;
		}
		return false;
	}
	
	private static int cycleLength(Node head) {
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				int cnt=0;
				Node temp=slow;
				do {
					temp=temp.next;
					cnt++;
				}while(temp!=slow);
				return cnt;
			}
		}
		return 0;
	}
	public static int firstElement(Node head) {
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				slow=head;
				while(slow!=fast) {
					slow=slow.next;
					fast=fast.next;
				}
				return slow.data;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Node head = new Node(3);
		head.next = new Node(2);
		head.next.next = new Node(0);
		head.next.next.next = new Node(-4);
		head.next.next.next.next = head.next;
		
		if(detectCycle(head)) {
			System.out.println("Cycle found");
		}
		else {
			System.out.println("cycle not found");
		}
		
		if(detectCycle2(head)) {
			System.out.println("Cycle found");
		}
		else {
			System.out.println("cycle not found");
		}
		
		System.out.println("cycle length is: "+cycleLength(head));
		System.out.println();
		System.out.println("first element from the cycle "+firstElement(head));
	}

}
