package com.ds.queue.linkedlist;

public class QueueTest {

	public static void main(String[] args) {

		QueueUsingLinkedList queue=new QueueUsingLinkedList();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		
		System.out.println("Queue List ::");
		queue.print();
		System.out.println();
		
		System.out.println("Dequeue from Queue::"+queue.dequeue());
		System.out.println("Dequeue from Queue::"+queue.dequeue());
		
		System.out.println("Queue List ::");
		queue.print();
		System.out.println();
	}

}
