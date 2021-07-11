
public class InsertingNode {
	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	// Inserts a new Node at front of the list.
	public void push(int newData) {
		Node newNode = new Node(newData); // Allocate the Node & Put in the data
		newNode.next = head; // Make next of newNode as head
		head = newNode; // Move the head to point to newNode
	}

	public static void main(String[] args) {
		InsertingNode llist = new InsertingNode();

		llist.head = new Node(1);

		Node second = new Node(2);
		Node third = new Node(3);

		llist.head.next = second;
		second.next = third;

		llist.printList();

		System.out.println();

		llist.push(0);
		llist.printList();

		System.out.println();

		llist.push(-1);
		llist.printList();

	}

}
