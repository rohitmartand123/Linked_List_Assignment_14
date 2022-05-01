package com.bridgelabz.linkedlist;
/*
 * Rohit
 * create a simple Linked List of 56, 30 and 70
 */
public class DataStructure {
	// Add element
		public static void add() {
			// create object
			MyLinkedList list = new MyLinkedList();
			
			list.add(70);
			list.add(30);
			list.add(56);
			
			// print node
			list.printNode();
		}
	public static void main(String[] args) {
		System.out.println("-----------Welcome to linked list program---------");
		System.out.println();

		System.out.println("Add Elements in List : ");
		add();
	}

}
