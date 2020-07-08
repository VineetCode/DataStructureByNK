package com.queue.dynamicsizearray;

public class DynamicArrayQueue {

	private int[] queueRep;
	private int front, rear, size;
	private static final int CAPACITY = 16;

	public DynamicArrayQueue() {
		front = 0;
		rear = 0;
		size = 0;
		queueRep = new int[CAPACITY];
	}

	public DynamicArrayQueue(int cap) {
		front = 0;
		rear = 0;
		size = 0;
		queueRep = new int[cap];
	}

	public void enQueue(int data) throws NullPointerException,
			IllegalStateException {

		if (size == CAPACITY)
			//expand();

		size++;
		queueRep[rear] = data;
		rear = (rear + 1) % CAPACITY;
	}

	public int deQueue() throws IllegalStateException {
		if (size == 0)
			throw new IllegalStateException("Queue is Empty :: Underflow");
		else {
			size--;
			int data = queueRep[(front % CAPACITY)];
			queueRep[front]=Integer.MIN_VALUE;
			front =(front+1)%CAPACITY;
			return data;
		}
	}
	
	public boolean isEmpty(){
	      return (size==0);
	}
	
	public boolean isFull(){
		return (size==CAPACITY);
	}
	
	public int size(){
		return size;
	}
	
	public String toString(){
		String result="[";
		for(int i=0;i<size();i++){
			 result+=Integer.toString(queueRep[(front+i)%CAPACITY]);
			 if(i<size()-1)
				 result+=",";
		}
		result +="]";
		return result;
	}

}
