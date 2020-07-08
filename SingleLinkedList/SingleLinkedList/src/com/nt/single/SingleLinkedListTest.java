package com.nt.single;

public class SingleLinkedListTest {

	public static void main(String[] args) {
		// create a SingleLinkedList object
		SingleLinkedList list = new SingleLinkedList();

		for (int i = 10; i <= 50; i += 10) {
			list.insertAtEnd(i);
		}
		list.insertAtBegining(1);
		list.traverse(list.getHeadNode());
		System.out.println();
		System.out.println("======================");

		list.insertAtGivenPosition(3, 5);
		list.traverse(list.getHeadNode());
		System.out.println();
		System.out.println("======================");

		list.traverse(list.getHeadNode());
		System.out.println();
		System.out.println("======================");

		System.out.println("Size of Linked List ::" + list.size());

		list.deleteFromBegining();
		list.traverse(list.getHeadNode());
		System.out.println();
		System.out.println("======================");

		list.deleteFromEnd();
		list.traverse(list.getHeadNode());
		System.out.println();

		list.deleteFromGivenPosition(3);
		list.traverse(list.getHeadNode());
		System.out.println();
		

		
		list.traverse(list.reverse()); System.out.println();
		System.out.println("======================");
		

	}// end of main() method

}// end of SingleLinkedList.class
