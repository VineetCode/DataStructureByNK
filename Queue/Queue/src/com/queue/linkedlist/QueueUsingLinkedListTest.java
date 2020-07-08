package com.queue.linkedlist;

public class QueueUsingLinkedListTest {

	public static void main(String[] args) throws Exception {

		QueueUsingLinkedList queue = new QueueUsingLinkedList();

		System.out.println("IsEmpty :: " + queue.isEmpty());
		System.out.println("Size of the Queue ::" + queue.size());
		System.out.println(queue);
		System.out.println("=================================");

		for (int i = 1; i <= 10; i++) {
			queue.enQueue(i);

		}
		System.out.println("IsEmpty :: " + queue.isEmpty());
		System.out.println("Size of the Queue ::" + queue.size());
		System.out.println(queue);

		System.out.println("Remove first Queue Element :: " + queue.deQueue());
		System.out.println("Size of the Queue ::" + queue.size());
		System.out.println(queue);

	}

}
