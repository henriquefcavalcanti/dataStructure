// Java project to demonstrate deletion in singly linked list

public class InteractiveDeleting {
	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// Given a key, deletes the first occurrence of key in linked list
	public void deleteNode(int key) {
		Node temp = head;
		Node prev = null;

		if (temp != null && temp.data == key) { // If head node itself holds the key to be deleted
			head = temp.next;
			return;
		}

		// Search for the key to be deleted, keep track of the previous node as we need
		// to change temp.next
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}

		if (temp == null) { // If key was not present in linked list
			return;
		}

		prev.next = temp.next; // Unlink the node from linked list

	}

	public void push(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	// main function
	public static void main(String[] args) {
		InteractiveDeleting llist = new InteractiveDeleting();

		llist.push(7);
		llist.push(1);
		llist.push(3);
		llist.push(2);

		System.out.println("Created Linked List is:");
		llist.printList();

		llist.deleteNode(1);

		System.out.println("\nLinked List after deletion of 1:");
		llist.printList();

	}

}
