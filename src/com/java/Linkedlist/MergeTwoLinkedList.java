package com.java.Linkedlist;

class List {
	int data;
	List next;

	public List() {
	}

	public List(int data) {
		this.data = data;
	}

	public List(int data, List next) {
		this.data = data;
		this.next = next;
	}
}

public class MergeTwoLinkedList {

	private static List merge(List head1, List head2) {
		List dummy = new List(-1);
		List ans = dummy;
		if (head1 == null)
			return head2;

		if (head2 == null)
			return head1;

		while (head1 != null && head2 != null) {
			if (head1.data <= head2.data) {
				ans.next = head1;
				ans = ans.next;
				head1 = head1.next;
			} else {
				ans.next = head2;
				ans = ans.next;
				head2 = head2.next;
			}
		}
		while (head1 != null) {
			ans.next = head1;
			ans = ans.next;
			head1 = head1.next;
		}
		while (head2 != null) {
			ans.next = head2;
			ans = ans.next;
			head2 = head2.next;
		}
		return dummy.next;
	}

	private static void printList(List head1) {
		List curr=head1;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
	
	public static void main(String[] args) {
		List head1 = new List(10);
		head1.next = new List(20);
		head1.next.next = new List(5);
		head1.next.next.next = new List(2);
		System.out.println("List 1 data");
		printList(head1);
		
		List head2 = new List(21);
		head2.next = new List(18);
		head2.next.next = new List(25);
		head2.next.next.next = new List(11);
		System.out.println("\nList 2 data");
		printList(head2);
		
		List mergeList = merge(head1, head2);
		System.out.println("\n\nAfter merging List");
		printList(mergeList);
	}

}
