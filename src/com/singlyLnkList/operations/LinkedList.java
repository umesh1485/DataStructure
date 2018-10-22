package com.singlyLnkList.operations;

public class LinkedList {

	public Node head;
	public int size = 0;

	public void insert(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (head == null) {
			head = newNode;
		} else {
			Node h = head;
			while (h.next != null) {
				h = h.next;
			}
			h.next = newNode;
		}

		size++;
	}

	public void insert(int index, int data) {
		if (index >= size) {
			throw new ArrayIndexOutOfBoundsException("Invalid Index");
		}

		Node newNode = new Node();
		newNode.data = data;
		int counter = 0;
		Node h = head;
		
		if(index==0){
			Node bck = head;
			newNode.next = bck;
			head = newNode;
		}else{	
			while (h != null) {
				if(index == ++counter){
					Node bck = h.next;
					h.next = newNode; 
					newNode.next = bck;
				}
				h = h.next;
			}
		}
	}
	
	public void remove(int index) {
		if (index >= size) {
			throw new ArrayIndexOutOfBoundsException("Invalid Index");
		}
		
		int counter = 0;
		if(index==0){
			Node bck = head.next;
			head = bck;
		}else{	
			Node h = head;
			while (h != null) {
				if(index == ++counter){
					Node bck = h.next.next;
					 h.next = bck;
				}
				h = h.next;
			}
		}
	}

	public void show() {
		Node n = head;
		while (n != null) {
			System.out.print("  "+n.data);
			n = n.next;
		}
		System.out.println("");
	}

	class Node {
		int data;
		Node next;
	}

}
