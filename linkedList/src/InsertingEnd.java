
public class InsertingEnd {
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

	// Appends a new node at the end
	public void append(int newData) {
		Node newNode = new Node(newData); // Allocate the Node & Put in the data. Set next as null

		if (head == null) { // If the Linked List head is empty, then make the new node as head
			head = newNode;
			return;
		}

//		newNode.next = null; // This node is going to be the last node, so make next of it as null

		Node last = head;
		while (last.next != null) { // Else traverse till the last node
			last = last.next;
		}

		last.next = newNode;
		return;

	}

	public static void main(String[] args) {
		InsertingEnd llist = new InsertingEnd();

		llist.head = new Node(1);

		Node second = new Node(2);
		Node third = new Node(3);

		llist.head.next = second;
		second.next = third;

		llist.printList();

		System.out.println();

		llist.append(4);
		llist.printList();
		
		System.out.println();

		llist.append(5);
		llist.printList();

	}

}
