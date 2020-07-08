package com.nt.doublelist;

public class DoubleLinkedList {

	public Node head;
	public Node tail;
	public int length;

	public DoubleLinkedList() {
		head = null;
		tail = null;
	}// end of Constructor

	public Node getHeadNode() {
		return head;
	}// end of getHead() method

	public Node getTailNode() {
		return tail;
	}// end of getTail() method
	
	public int size(){
		return length;
	}//end of size() method

	public void insertAtBegining(int data) {
		Node newNode = new Node(data);
		if (head == null || tail == null) {
			head = tail = newNode;
			length++;
		} else {
			newNode.next = head;
			head.previous = newNode;
			head = newNode;
			length++;
		}// end of else block
	}// end of insertAtBeginging() method

	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		Node current = head;

		if (head == null || tail == null) {
			head = newNode;
			tail = newNode;
			length++;
		} else {
			while (current.next != null) {
				current = current.next;
			}// end of while-block
			current.next = newNode;
			newNode.previous = current;
			tail = newNode; 
			length++;
		}// end of else block
		
	}// end of insertAtEnd() method

	public void insertAtGivenPosition(int pos, int data) {
		Node newNode = new Node(data);
		Node current = head;

		int node_pos = 1;
		if (head == null || tail == null) {
			head = newNode;
			tail = newNode;
			length++;
		} else {
			while (current.next != null) {
				current = current.next;
				node_pos++;
				if (node_pos + 1 == pos) {
					newNode.next = current.next;
					current.next.previous = newNode;
					current.next = newNode;
					newNode.previous = current;
				}// end of if-block
			}// end of while-block
			length++;
		}// end of else block
		
	}// end of insertAtGivenPosition() method

	public void traverse(Node head) {
		if (head == null || tail == null) {
			System.out.println("Sorry,Linked List is Empty!!!");
		} else {
			Node current = head;
			while (current != null) {
				System.out.print(current.data + "-->");
				current = current.next;
			}// end of while-block
		}// end of else-block
	}// end of traverse() method

	public void reverse(Node tail) {
     Node current=tail;
     while(current!=null){
    	 System.out.print(current.data+"=>");
    	 current=current.previous;
     }//end of while-loop
	}// end of reverse() method

	public void deleteFromBegining() {
		if (head == null || tail == null) {
            System.out.println("Sorry,LinkedList is empty!!!");
		}//end of if-block
		head=head.next;
		head.next.previous=null;
		
		length--;
	}// end of deleteFromBegining() method

	public void deleteFromEnd() {
		Node current=head;
		if (head == null || tail == null) {
            System.out.println("Sorry,LinkedList is empty!!!");
		}else{
		      while(current.next!=null){
		    	 current=current.next; 
		      }//end of while
		      current.previous.next=null;
		      length--;
		}//end of else-block
	}// end of deleteFromEnd() method

	public void deleteFromGivenPosition(int pos) {
		Node current = head;

		int node_pos = 1;
		if (head == null || tail == null) {
			System.out.println("Sorry,Linked List is Empty !!!");
		} else {
			while (current.next != null) {
				current = current.next;
				node_pos++;
				if (node_pos== pos) {
					current.previous.next=current.next;
					current.next.previous=current.previous;
					current.previous=null;
					current.next=null;
				}// end of if-block
			}// end of while-block
           length--; 
		}// end of else block

	}// end of deleteFromGivenPosition() method

}// end of DoubleLinkedList.class
