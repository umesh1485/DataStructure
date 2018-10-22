package com.singlyLnkList.operations;

public class Runner {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		//insert
		list.insert(12);
		list.insert(14);
		list.insert(15);
		list.show();
		//Update
		list.insert(2, 444);
		//Read
		list.show();
		//Delete
		list.remove(0);
		
		list.show();
		
		
	}

}
