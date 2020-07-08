package com.ds.queue.linkedlist;

import java.util.NoSuchElementException;

public class QueueUsingLinkedList {
	
	private Node rear;
	private Node front;
	private int length;
	
	public QueueUsingLinkedList(){
		rear=null;
		front=null;
	}
	
	public int length(){
		return length;
	}
	
	public boolean isEmpty(){
		return length==0;
	}
	
	public void enqueue(int data){
		Node temp=new Node(data);
		if(isEmpty()){
			front=temp;
		}else{
			rear.next=temp;
		}
		rear=temp;
		length++;
	}
	
	public int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is Empty!!!");
			throw new NoSuchElementException();
		}
		int result=front.data;
		front=front.next;
		if(front==null){
			rear=null;
		}
		length--;
		return result;
	}
	
	public void print(){
		Node temp=front;
		while(temp!=null){
			System.out.print(temp.data+ " ");
			temp=temp.next;
		}
	}

}
