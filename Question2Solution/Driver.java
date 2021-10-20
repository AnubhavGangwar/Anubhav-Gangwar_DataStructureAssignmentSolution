package com.Anubhav_GreatLearning.DataStructureAssignment.Question2Solution;

import com.Anubhav_GreatLearning.DataStructureAssignment.Question2Solution.Operation.Node;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation opn = new Operation();

		Node node = new Node(50);
		Node node1 = new Node(60);
		Node node2 = new Node(30);
		Node node3 = new Node(10);
		Node node4 = new Node(55);
		node.left = node2;
		node.right = node1;
		node2.left = node3;
		node1.left = node4;
		opn.findSkew(node);

	}
}


