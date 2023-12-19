package com.java.Linkedlist;

class LNode {
	int data;
	LNode next;

	public LNode() {

	}

	public LNode(int data) {
		this.data = data;
	}

	public LNode(int data, LNode next) {
		this.data = data;
		this.next = next;
	}
}

public class DeleteMiddleElement {

	public static LNode deleteMid(LNode head) {
		// This is method only submission.
		// You only need to complete the method.
		if (head == null || head.next == null)
			return null;
		LNode slow = head;
		LNode fast = head;
		LNode prev = null;
		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		prev.next = prev.next.next;
		return head;
	}

	private static void printList(LNode head) {
		LNode LNode = head;
		while (LNode != null) {
			System.out.print(LNode.data + " ");
			LNode = LNode.next;
		}
	}

	public static void main(String[] args) {
		LNode head = new LNode(10);
		head.next = new LNode(3);
		head.next.next = new LNode(30);
		head.next.next.next = new LNode(21);
		head.next.next.next.next = new LNode(5);
		System.out.println("List traversal is");
		printList(head);
		
		System.out.println("\nafter deleting middle element");
		LNode LNode1=deleteMid(head);
		printList(LNode1);
		
	}
}
