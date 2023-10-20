package com.java.Linkedlist;

class ListNode1 {
	int data;
	ListNode1 next;

	public ListNode1() {
		super();
	}

	public ListNode1(int data) {
		this.data = data;
	}

	public ListNode1(int data, ListNode1 next) {
		this.data = data;
		this.next = next;
	}
}

public class ReverseLinkedlist {

	private static ListNode1 reverse(ListNode1 node) {
		ListNode1 prev = null;
		ListNode1 curr = node;
		ListNode1 next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	private static void printList(ListNode1 node) {
		ListNode1 curr = node;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

	public static void main(String[] args) {
		ListNode1 node = new ListNode1(1);
		node.next = new ListNode1(2);
		node.next.next = new ListNode1(3);
		node.next.next.next = new ListNode1(4);

		System.out.println("before reversing list");
		printList(node);

		System.out.println("\nafter reversing list");
		ListNode1 revList = reverse(node);
		printList(revList);
	}

}
