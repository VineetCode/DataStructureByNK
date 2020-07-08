package com.nt.linklist;

public class LinkedStackTest {
	public static void main(String[] args) {
		LinkedStack<Integer> stack = new LinkedStack<Integer>();
		
		System.out.println("Stack IsEmpty ::"+stack.isEmpty());
		System.out.println("Size of Stack ::"+stack.size());

		System.out.println(stack);
		
		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}
		System.out.println(stack);
		
		System.out.println("Stack IsEmpty ::"+stack.isEmpty());
		System.out.println("Size of Stack ::"+stack.size());

		
		System.out.println("Peek the Element ::"+stack.peek());
		System.out.println("Pop the Element ::"+stack.pop());

	}
}
