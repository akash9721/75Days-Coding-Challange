package com.java.Linkedlist;
class SingleListNode{
	int data;
	SingleListNode next;
	
	public SingleListNode() {
		
	}
	
	public SingleListNode(int data) {
		this.data=data;
	}

}

public class LinkedListOperations {

	public static void printData(SingleListNode head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	
	public static SingleListNode removeDuplicate(SingleListNode head) {
		SingleListNode p=head;
		if(head==null || head.next==null) {
			return head;
		}
		SingleListNode q=head.next;
		while(q!=null) {
			if(p.data==q.data) {
				p.next=q.next;
				q=p.next;
			}
			else {
				p=q;
				q=q.next;
			}
		}
		return head;
	}
	public static void main(String[] args) {
		SingleListNode head=new SingleListNode(1);
		head.next=new SingleListNode(1);
		head.next.next=new SingleListNode(5);
		head.next.next.next=new SingleListNode(6);
		head.next.next.next.next=new SingleListNode(6);
		head.next.next.next.next.next=new SingleListNode(9);
		System.out.println("original data");
		printData(head);
		
		System.out.println("\nafter removing duplicate data");
		SingleListNode node=removeDuplicate(head);
		printData(node);
		
		
	}
}
