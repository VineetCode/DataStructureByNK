package com.nt.single;

public class SingleLinkedList {

	public Node head;
	public int length;

	public SingleLinkedList() {
		head = null;
	}// end of constructor

	public int size() {
		return length;
	}// end of size() method

	public Node getHeadNode() {
		return head;
	}// end of getHeadNode() method

	public void traverse(Node head) {
		Node current = head;
		if (current == null) {
			System.out.println("Sorry,Linked List is empty!!!");
		} else {
			while (current != null) {
				System.out.print(current.data + "-->");
				current = current.next;
			}// end of while-block
		}// end of else-block

	}// end of traverse(-) method

	public void insertAtBegining(int data) {
		Node current = head;
		Node newNode = new Node(data);
		if (current == null) {
			head = newNode;
			length++;
		} else {
			newNode.next = head;
			head = newNode;
			length++;
		}// end of else-block

	}// end of insertAtBegin(-) method

	public void insertAtEnd(int data) {
		Node current = head;
		Node newNode = new Node(data);
		if (current == null) {
			head = newNode;
			length++;
		} else {
			while (current.next != null) {
				current = current.next;
			}// end of while-block
			current.next = newNode;
			length++;
		}// end of else-block

	}// end of insertAtEnd() method

	public void insertAtGivenPosition(int pos, int data) {
		int node_pos = 1;
		Node current = head;
		Node newNode = new Node(data);
		if (current == null) {
			head = newNode;
			length++;
		} else {
			while (current.next != null) {
				current = current.next;
				node_pos++;
				if (node_pos+1 == pos) {
					newNode.next = current.next;
					current.next = newNode;
				}// end of if-block
			}// end of while-block
			length++;
		}// end of else-block

	}// end of insertAtGivenPosition(-,-) method

	public Node reverse() {
		Node current = head;
		Node previous = null;
		Node next = null;

		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}// end of while-loop
		 head=previous;
		return head;
	}// end of reverse() method

	public void deleteFromBegining() {
		Node current = head;
		System.out.println("Head ::"+head);
		if (head == null) {
			System.out.println("Sorry,Linked List is Empty!!!");
		}
		head = current.next;
		current.next = null;
		length--;
	}// end of deleteFromBegining()method

	public void deleteFromEnd() {
		Node current = head;
		Node previous = null;
		if (current == null) {
			System.out.println("Sorry,Linked List is Empty!!!");
		}
		
		while(current.next!=null){
			previous=current;
			current=current.next;
		}//end of while-block
        previous.next=null;
        length--;
	}// end of deleteFromEnd() method

	public void deleteFromGivenPosition(int pos) {
		int node_pos = 1;
		Node current = head;
		Node previous=null;
		if (current == null) {
			System.out.println("Sorry,Linked List is Empty!!!");
		} else {
			while (current.next != null) {
				previous=current;
				current = current.next;
				node_pos++;
				if (node_pos == pos) {
				  previous.next=current.next;
				  current.next=null;
				}// end of if-block
			}// end of while-block
			length--;
		}
	}// end of deleteFromGivenPosition() method
}// end of SingleLinkedList.class
