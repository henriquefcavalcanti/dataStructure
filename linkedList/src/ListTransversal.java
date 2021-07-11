
public class ListTransversal {
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
			System.out.print(n.data + " ");
			n = n.next;
		}

	}

	public static void main(String[] args) {
		ListTransversal llist = new ListTransversal();
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node (3);
		
		llist.head.next = second;
		second.next = third;
		
		llist.printList();
	}

}
