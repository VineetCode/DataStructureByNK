package com.ds.stack.array;

public class StackUsingArrayTest {

	public static void main(String[] args) throws StackOverFlowException, StackEmptyException {
      StackUsingArray stack=new StackUsingArray(5);
      stack.push(10);
      stack.push(20);
      stack.push(30);
      stack.push(40);
      stack.push(50);
      
      System.out.println("Peek ::"+stack.peek());
      
      System.out.println("Pop ::"+stack.pop());
      
      System.out.println("Peek ::"+stack.peek());
      
      stack.push(50);
      stack.push(60);
	}

}
