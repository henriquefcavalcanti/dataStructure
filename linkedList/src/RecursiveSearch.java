// Recursive Java program to search an element in Linked List

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class RecursiveSearch {
	Node head;

	public void push(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}

	// Checks whether the value x is present in linked list
	public boolean search(Node head, int x) {
		if (head == null) { // base case
			return false;
		}

		// If key is present in current node, return true
		if (head.data == x) {
			return true;
		}

		// Recur for remaining list
		return search(head.next, x);
	}

	public static void main(String args[]) {
		RecursiveSearch llist = new RecursiveSearch();

		llist.push(10);
		llist.push(30);
		llist.push(11);
		llist.push(21);
		llist.push(14);

		if (llist.search(llist.head, 21)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
