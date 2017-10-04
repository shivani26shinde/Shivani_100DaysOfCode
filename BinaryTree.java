// Add nodes to the binary tree and print the tree (Inorder traversal)

import java.util.*;
import java.lang.*;
import java.io.*;

class BinaryTree
{
	public static Node root = null;
	public static void addNode(int value){
		Node temp = new Node(value);
		if(root == null){
			root = temp;
			return;
		}
		Node parent = root;
		Node current = root;
		while(current != null){
			parent = current;
			if(value<parent.value){
				current = parent.left;
				if(current == null){
					parent.left = temp;
					return;
				}
			}
			else{
				current = parent.right;
				if(current == null){
					parent.right = temp;
					return;
				}
			}
		}
	}
	public static void printNodes(Node root){
		if(root != null){
			printNodes(root.left);
			System.out.println(root.value);
			printNodes(root.right);
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		addNode(5);addNode(3);
		addNode(4);addNode(7);
		addNode(9);addNode(1);
		addNode(1);addNode(6);
		printNodes(root);
	}
}
class Node{
	int value;
	Node left;
	Node right;
	Node(int value){
		this.value = value;
	}
}