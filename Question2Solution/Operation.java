package com.Anubhav_GreatLearning.DataStructureAssignment.Question2Solution;

public class Operation {
	static class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = right = null;
		}
	}

	public void findSkew(Node root) {
		if (root != null) {
			findSkew(root.left);
			System.out.print(root.data+", ");
			findSkew(root.right);
		}
	}

}
