package com.java.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class LeftAndRightViewOfBinaryTree {

	private static List<Integer> leftView(Node root) {
		List<Integer> ans = new ArrayList<Integer>();
		if (root == null)
			return ans;
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int n = queue.size();
			for (int i = 0; i < n; i++) {
				Node curr = queue.peek();
				queue.remove();
				if (i == 0) {
					ans.add(curr.data);
				}
				if (curr.left != null)
					queue.add(curr.left);
				if (curr.right != null)
					queue.add(curr.right);
			}
		}
		return ans;
	}

		private static List<Integer> rightView(Node root) {
			List<Integer> ans = new ArrayList<Integer>();
			if (root == null)
				return ans;
			Queue<Node> queue = new LinkedList<Node>();
			queue.add(root);
			while (!queue.isEmpty()) {
				int n = queue.size();
				for (int i = 0; i < n; i++) {
					Node curr = queue.peek();
					queue.remove();
					if (i == n-1) {
						ans.add(curr.data);
					}
					if (curr.left != null)
						queue.add(curr.left);
					if (curr.right != null)
						queue.add(curr.right);
				}
			}
			return ans;
		}
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(2);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(55);
		root.right.right = new Node(100);
		root.left.right.left=new Node(30);
		/*       10
		 *    2      30
		 * 40     55      100 
		 *     30  
		   */        
		List<Integer> leftView = leftView(root);
		System.out.println("left view of binary tree: "+leftView);
		
		System.out.println();
		List<Integer> rightView = rightView(root);
		System.out.println("right view of binary tree: "+rightView);
	}

}
