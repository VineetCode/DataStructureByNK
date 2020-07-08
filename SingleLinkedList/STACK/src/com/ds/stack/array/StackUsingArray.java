package com.ds.stack.array;

public class StackUsingArray {
	private int top=-1;
	private int length=0;
	private int[] stack=null;
	private int size;
	
	public StackUsingArray(int size){
		stack=new int[this.size=size];
	}
	
	public int length(){
		return length;
	}
	public boolean isEmpty(){
		return length==0;
	}
	
	public void push(int data) throws StackOverFlowException{
		if(top>size){
		
				throw new StackOverFlowException("Stack is Full !!!");

		}
		stack[++top]=data;
		length++;
	}
	
	public int pop() throws StackEmptyException{
		if(isEmpty()){
			throw new StackEmptyException("Stack is Empty..");
		}
		int data=stack[top--];
		length--;
		return data;
	}
	
	public int peek() throws StackEmptyException{
		if(isEmpty()){
			throw new StackEmptyException("Stack is Empty..");
		}
		
		return stack[top];
	}

}
