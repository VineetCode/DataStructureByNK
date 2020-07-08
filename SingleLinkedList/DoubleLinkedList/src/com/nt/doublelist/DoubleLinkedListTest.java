package com.nt.doublelist;

public class DoubleLinkedListTest {

	public static void main(String[] args) {
       //create DoubleLinkedList object
		DoubleLinkedList list=new DoubleLinkedList();
		
		for (int i = 10; i <= 50; i += 10) {
			list.insertAtEnd(i);
		}//end of for-loop
	//	list.insertAtBegining(5);
		list.traverse(list.getHeadNode());
		System.out.println();
		System.out.println("======================");

        list.insertAtGivenPosition(3,25);
        list.traverse(list.getHeadNode());
		System.out.println();
		System.out.println("======================");
        
		list.deleteFromGivenPosition(3);
		list.traverse(list.getHeadNode());
		System.out.println();
		System.out.println("======================");
        
		System.out.println("Head Node ::"+list.getHeadNode());
		System.out.println("======================");
		System.out.println("Tail Node ::"+list.getTailNode());
		System.out.println("======================");
		list.reverse(list.getTailNode());
		System.out.println();
		System.out.println("======================");
		System.out.println("Size ::"+list.size());
        
	}//end of main() method

}//end of DoubleLinkedListTest.class
