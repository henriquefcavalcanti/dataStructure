
public class InsertingAfter {
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

	// Inserts a new node after the given preNode
	public void insertAfter(Node prevNode, int newData) {
		if (prevNode == null) { // Check if the given Node is null
			System.out.println("The given previous node cannot be null");
			return;
		}

		Node newNode = new Node(newData); // Allocate the Node & Put in the data
		newNode.next = prevNode.next; // Make next of new Node as next of prevNode
		prevNode.next = newNode; // Make next of prevNode as newNode

	}

	public static void main(String[] args) {
		InsertingAfter llist = new InsertingAfter();

		llist.head = new Node(1);

		Node second = new Node(2);
		Node third = new Node(3);

		llist.head.next = second;
		second.next = third;

		llist.printList();

		System.out.println();

		llist.insertAfter(second, 5);
		llist.printList();

	}

}
