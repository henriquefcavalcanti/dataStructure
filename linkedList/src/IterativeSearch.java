// Iterative Java program to search an element in Linked List

public class IterativeSearch {
	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void push(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}

	// Checks whether the value x is present in Linked List
	public boolean search(int x) {
		Node current = head; // initialize current

		while (current != null) {
			if (current.data == x) {
				return true; // data found
			}
			current = current.next;
		}
		return false; // data not found
	}
	
	public static void main(String[] args) {
		IterativeSearch llist = new IterativeSearch();
		
		llist.push(10);
		llist.push(30);
		llist.push(11);
		llist.push(21);
		llist.push(14);
		
		if(llist.search(21)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}

}









