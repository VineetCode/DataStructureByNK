package com.ds.stack.linkedlist;

public class StackUsingLinkedListTest {

	public static void main(String[] args) {

		StackUsingLinkedList stackList = new StackUsingLinkedList();
		stackList.push(10);
		stackList.push(20);
		stackList.push(30);
		stackList.push(40);
		stackList.push(50);

		System.out.println("Peek ::" + stackList.peek());

		System.out.println("Pop ::" + stackList.pop());

		System.out.println("Peek ::" + stackList.peek());

		stackList.push(50);
		stackList.push(60);
	}

}
