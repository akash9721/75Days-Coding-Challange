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
		ListNode node=head;
		ListNode node1=new ListNode(data);
		if(node==null) {
			return node1;
		}
		node1.next=node;
		node=node1;
		return node;
	}
	
	private static ListNode insertAtLast(ListNode head, int data) {
		ListNode node=head;
		ListNode nodex=new ListNode(data);
		if(node==null) {
			return nodex;
		}
		while(node.next!=null) {
			node=node.next;
		}
		node.next=nodex;
		return head;
	}
	
	private static void printList(ListNode head) {
		ListNode node=head;
		while(node!=null) {
			System.out.print(node.data+" ");
			node=node.next;
		}
	}
	
	public static void main(String[] args) {
      ListNode head=new ListNode(10);
      head.next=new ListNode(3);
      head.next.next=new ListNode(30);
      head.next.next.next=new ListNode(21);
      head.next.next.next.next=new ListNode(5);
      System.out.println("List traversal is");
      printList(head);
      
      System.out.println();
      System.out.println("insert at first place");
      ListNode node=insertAtFirst(head,100);
      printList(node);
      
      System.out.println();
      System.out.println("insert at last place");
      ListNode node1=insertAtLast(node, 500);
      printList(node1);
	}

}
