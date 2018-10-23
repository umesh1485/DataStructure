package com.singlyLnkList.operations;

public class Runner {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		//insert
		list.insert(12);
		list.insert(14);
		list.insert(15);
		//Read
		System.out.println("Read: ");
		list.printList(list.head);
		
		//Update
		list.insert(2, 444);
		System.out.println("Update: list.insert(2, 444)");
		list.printList(list.head);
		
		//Delete
		list.remove(0);
		System.out.println("Delete: remove(0)");
		list.printList(list.head);
		
		//reverse
		LinkedList.Node node =list.reverse(list.head);
		System.out.println("Reverse:");
		list.printList(node);
		
		
	}

}
