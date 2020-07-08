package com.queue.linkedlist;

public class QueueUsingLinkedList {

	private int length;
	private ListNode front, rear;

	// Create an Empty Queue
	public QueueUsingLinkedList() {
		length = 0;
		front = rear = null;
	}

	// Checking queue is empty or not
	public boolean isEmpty() {
		return (length == 0);
	}

	// Adds the specified element to the rear of the queue
	public void enQueue(int data) throws Exception {

		ListNode node = new ListNode(data);
		if (isEmpty()) 
			front = node;
		else
		   rear.setNext(node);
		rear = node;
		length++;
	}

	// Return and remove front element of the queue
	public int deQueue() throws Exception {
		if (isEmpty())
			throw new Exception("Queue is Empty!!!");

		int result = front.getData();
		front = front.getNext();
		length--;
		if (isEmpty())
			rear = null;
		return result;
	}

	// Return the first element of the queue
	public int first() throws Exception {

		if (isEmpty())
			throw new Exception("Queue is  Empty");
		return front.getData();
	}

	// Return the number the element of the queue
	public int size() {
		return length;
	}

	// Return the String Representation of the Queue
	public String toString() {
		String result = "";
		ListNode current = front;
		while (current != null) {
			result =result + current.getData() + "\t";
			//System.out.println(result);
			current = current.getNext();
		}
		return result;
	}

}
