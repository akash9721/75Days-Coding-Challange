package com.java.Linkedlist;

class ListNode {
	int data;
	ListNode next;

	public ListNode() {

	}

	public ListNode(int data) {
		this.data = data;
	}

	public ListNode(int data, ListNode next) {
		this.data = data;
		this.next = next;
	}
}

public class SingleLinkedlist {

	private static ListNode insertAtFirst(ListNode head, int data) {
		ListNode node = head;
		ListNode node1 = new ListNode(data);
		if (node == null) {
			return node1;
		}
		node1.next = node;
		node = node1;
		return node;
	}

	private static ListNode insertAtLast(ListNode head, int data) {
		ListNode node = head;
		ListNode nodex = new ListNode(data);
		if (node == null) {
			return nodex;
		}
		while (node.next != null) {
			node = node.next;
		}
		node.next = nodex;
		return head;
	}

	private static ListNode insertAtPosition(ListNode head, int data, int n) {
		ListNode node = head;
		ListNode node1 = new ListNode(data);
		if (n < 1) {
			System.out.println("Invalid position");
		} else if (n == 1) {
			if (node == null) {
				return node1;
			}
			node1.next = node;
			node = node1;
			return node;
		}
		else {
			for(int i=1;i<n-1;i++) {
				node=node.next;
			}
			node1.next=node.next;
			node.next=node1;
		}
		return head;
	}

	private static void printList(ListNode head) {
		ListNode node = head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(10);
		head.next = new ListNode(3);
		head.next.next = new ListNode(30);
		head.next.next.next = new ListNode(21);
		head.next.next.next.next = new ListNode(5);
		System.out.println(" List traversal is");
		printList(head);

		/*System.out.println("\ninsert at first place");
		ListNode node = insertAtFirst(head, 100);
		printList(node);

		System.out.println("\ninsert at last place");
		ListNode node1 = insertAtLast(node, 500);
		printList(node1);*/

		System.out.println("\ninsert at given position");
		ListNode node2 = insertAtPosition(head, 999, 3);
		printList(node2);
		
		System.out.println("\nfind nth element from the last");
		System.out.println("is: "+findNthFromLast(head,2));
		

	}

	private static int findNthFromLast(ListNode head,int n) {
//		int cnt=0;
//		ListNode curr=head;
//		while(curr!=null) {
//			curr=curr.next;
//			cnt++;
//		}
//		
//		curr=head;
//		for(int i=0;i<cnt-n;i++) {
//			curr=curr.next;
//		}
//		return curr.data;
		
		ListNode curr=head;
		ListNode slow=head;
		ListNode fast=head;
		for(int i=0;i<n;i++) {
			if(fast==null)
				return -1;
			fast=fast.next;
		}
		
		while(fast!=null) {
			slow=slow.next;
			fast=fast.next;
		}
		return slow.data;
		
	}

}
