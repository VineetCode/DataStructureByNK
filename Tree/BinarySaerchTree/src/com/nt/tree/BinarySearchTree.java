package com.nt.tree;

public class BinarySearchTree {

	public Node root;

	public BinarySearchTree() {
		root = null;
	}

	public void insert(int key) {
		
		Node node = new Node(key);
		if (root == null) {
			root = node;
			return;
		}

		Node current = root;
		Node parent = null;

		while (current != null) {
			parent = current;
			if (key > current.data) {
				current = current.right;
				if (current == null)
					parent.right = node;
			} else {
				current = current.left;

				if (current == null)
					parent.left = node;
			}

		}// while block
	}// insert() method

	public void displayByInOrder(Node root) {
		if (root != null) {
			displayByInOrder(root.left);
			System.out.print(root.data + " ");
			displayByInOrder(root.right);
		}
	}

	public void displayByPreOrder(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			displayByPreOrder(root.left);
			displayByPreOrder(root.right);
		}
	}

	public void displayByPostOrder(Node root) {
		if (root != null) {
			displayByPostOrder(root.left);
			displayByPostOrder(root.right);
			System.out.print(root.data + " ");
		}
	}

	public boolean search(int key) {
		Node current = root;
		while (current != null) {
			if (current.data == key)
				return true;
			else if (key > current.data) {
				current = current.right;
			} else {
				current = current.left;
			}

		}// while
		return false;
	}// search(-) method
/*
	public boolean delete(int key) {

		Node parent = root;
		Node current = root;
		boolean isLeftChild = false;

		while (current.data != key) {
			parent = current;

			if (key > current.data) {
				isLeftChild = false;
				current = current.right;

			} else {
				isLeftChild = true;
				current = current.left;

			}
			if (current == null)
				return false;
		}// while loop

		// if i am here that means we have found the node
		// Case 1: if node to be deleted has no children

		if (current.left == null && current.right == null) {
			if (current == root)
				root = null;

			if (isLeftChild == true)
				parent.left = null;
			else
				parent.right = null;
		}
		// Case 2 : if node to be deleted has only one child

		else if (current.right == null) {
			if(current==root)
				root=current.left;
			else if(isLeftChild)
				parent.left=current.left;
			else
				parent.right=current.left;

		} else if (current.left == null) {
              if(current==root)
            	  root=current.right;
              else if(isLeftChild)
            	  parent.left=current.right;
              else
            	  parent.right=current.right;
		}
		else if(current.left!=null && current.right!=null){
			//now we have found the minimum element in the right sub tree
			Node successor= getSuccessor(current);
		}
	}// delete() method
    
	public Node getSuccessor(Node deleteNode){
		
	}*/
}// BinarySearchTree class
