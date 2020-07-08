package com.queue.fixedsizearray;

public class FixedSizeArrayQueue {

	// Array used to implement the queue
	private int front, rear, size;
	private int[] queueRep;

	// Length of the array used to implement the queue
	private static final int CAPACITY = 16;

	// Initializes the queue to use an array of default length
	public FixedSizeArrayQueue() {
		front = 0;
		rear = 0;
		size = 0;
		queueRep = new int[CAPACITY];
	}

	// Initializes the queue to use an given length
    public FixedSizeArrayQueue(int cap) {
		front = 0;
		rear = 0;
		size = 0;
		queueRep = new int[cap];
	}

	// Insert an element at the rear of the queue.
    public void enQueue(int data) throws NullPointerException,
			IllegalStateException {
    	//System.out.println(size+ "==="+CAPACITY);
		if (size == CAPACITY)
			throw new IllegalStateException("Queue is full :Overflow!!!");
		else {
			size++;
			queueRep[rear] = data;
			rear = (rear + 1) % CAPACITY;
		}
	}

	// Remove the front element of the queue
	public int deQueue() throws IllegalStateException {
		if (size == 0)
			throw new IllegalStateException("Queue is Empty : Underflow!!!");
		else {
			size--;
			int result = queueRep[(front % CAPACITY)];
			queueRep[front] = Integer.MIN_VALUE;
			front = (front + 1) % CAPACITY;
			return result;
		}
	}

	// Check whether queue is Empty or not
	public boolean isEmpty() {
		return (size == 0);
	}

	// Check whether queue is Full or not
	public boolean isFull() {
		return (size == CAPACITY);
	}

	// Return the number of element in the queue
	public int size() {
		return size;
	}

	// Return a String representation of the queue

	public String toString() {
		String result = "[";

		for (int i = 0; i < size(); i++) {
			result += Integer.toString(queueRep[(front + i) % CAPACITY]);
			if (i < size() - 1)
				result += ",";
		}
		result += "]";
		return result;
	}

}
