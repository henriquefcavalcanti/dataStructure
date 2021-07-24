// Java program to find middle of linked list

public class FindMiddle2 {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// function to print middle of linked list
	void printMiddle() {
		Node slow_ptr = head;
		Node fast_ptr = head;
		if (head != null) {
			while (fast_ptr != null && fast_ptr.next != null) {
				fast_ptr = fast_ptr.next.next;
				slow_ptr = slow_ptr.next;
			}
			System.out.println("The middle element is " + slow_ptr.data);
		}
	}

	public void push(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}

	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " -> ");
			tnode = tnode.next;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {
		FindMiddle2 llist = new FindMiddle2();

		for (int i = 5; i > 0; i--) {
			llist.push(i);
			llist.printList();
			llist.printMiddle();
		}

	}

}
