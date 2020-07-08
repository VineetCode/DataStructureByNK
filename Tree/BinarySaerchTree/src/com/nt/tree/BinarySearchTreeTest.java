package com.nt.tree;

public class BinarySearchTreeTest {
	public static void main(String[] args) {
		
		BinarySearchTree b = new BinarySearchTree();
		b.insert(3);
		b.insert(8);
		b.insert(1);
		b.insert(4);
		b.insert(6);
		b.insert(2);
		b.insert(10);
		b.insert(9);
		b.insert(20);
		b.insert(25);
		b.insert(15);
		b.insert(16);
		System.out.println("Original Tree : ");
		b.displayByInOrder(b.root);
		System.out.println("");
		
		System.out.println(b.search(21));
	}
}
