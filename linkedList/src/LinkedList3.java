
public class LinkedList3 {
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

	public void insertAfter(Node prevNode, int newData) {
		if (prevNode == null) {
			System.out.println("The previous node can not be null!!");
			return;
		}
		Node newNode = new Node(newData);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}

	public void append(int newData) {
		Node newNode = new Node(newData);

		if (head == null) {
			head = newNode;
			return;
		}

		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = newNode;
		return;
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
		LinkedList3 llist = new LinkedList3();

		llist.append(2);
		llist.append(5);
		llist.append(95);

		llist.printList();
		System.out.println();

		llist.push(0);
		llist.push(6);
		llist.printList();
		System.out.println();

		llist.insertAfter(llist.head.next, 645);
		llist.printList();

	}

}
