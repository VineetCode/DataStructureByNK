package com.nt.doublelist;

public class Node {
  
	int data;
	Node previous;
	Node next;
	
	public Node(int data){
		this.data=data;
		next=null;
		previous=null;
	}

	@Override
	public String toString() {
		return "Node [" + data +  "]";
	}
	
	
}//end of Node.class
