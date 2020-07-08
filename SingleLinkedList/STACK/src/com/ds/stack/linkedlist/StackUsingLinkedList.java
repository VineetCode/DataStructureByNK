package com.ds.stack.linkedlist;

import java.util.EmptyStackException;

public class StackUsingLinkedList<T> {
	
	private Node<Integer> top=null;
	private int length=0;
	
	public StackUsingLinkedList(){
		
	}
	public int length(){
		return length;
	}
	
	public boolean isEmpty(){
		return length==0;
	}
	
	public void push(Integer data){
		Node<Integer> temp=new Node<Integer>(data);
		temp.next=top;
		top= temp;
		length++;
	}
	
	public int pop(){
		if(isEmpty()){
			throw new EmptyStackException();
		}
		 int data=top.data;
		top=top.next;
		return data;
	}
	
	public int peek(){
		if(isEmpty()){
			throw new EmptyStackException();
		}
		return top.data;
	}
	
	

}
