// Java program to delete a Linked List

public class DeleteList {
	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void deleteList() {
		head = null;
	}

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public static void main(String[] args) {
		DeleteList llist = new DeleteList();

		llist.push(1);
		llist.push(4);
		llist.push(1);
		llist.push(12);
		llist.push(1);

		llist.printList();

		llist.deleteList();

		System.out.println("\nLinked List deleted");

		llist.printList();
	}

}
