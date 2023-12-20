package com.java.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	public TreeNode() {
	}

	TreeNode(int data) {
		this.data = data;
	}

	TreeNode(int data, TreeNode left, TreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}

public class BinaryTree {

	private static void inorder(TreeNode root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}

	private static void postorder(TreeNode root) {
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data + " ");
		}
	}

	private static void preorder(TreeNode root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preorder(root.left);
			preorder(root.right);
		}
	}

	public static List<Integer> levelorder(TreeNode root) {
		List<Integer> ans = new ArrayList<Integer>();
		if (root == null) {
			return ans;
		}
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while (!q.isEmpty()) {
			int n = q.size();
			for (int i = 0; i < n; i++) {
				TreeNode curr = q.peek();
				q.remove();
				ans.add(curr.data);
				if (curr.left != null)
					q.add(curr.left);
				if (curr.right != null)
					q.add(curr.right);
			}
		}
		return ans;

	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(19);
		root.right = new TreeNode(30);
		root.left.left = new TreeNode(40);
		root.left.right = new TreeNode(80);
		System.out.println("Inorder traversal: ");
		inorder(root);

		System.out.println("\nPreorder traversal: ");
		preorder(root);

		System.out.println("\nPostorder traversal: ");
		postorder(root);

		System.out.println("\nLevel order traversal: ");
		List<Integer> levelorder = levelorder(root);
		for (Integer x : levelorder) {
			System.out.print(x + " ");
		}
	}

}
