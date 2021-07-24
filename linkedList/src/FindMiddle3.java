// Java program to find middle of linked list

public class FindMiddle3 {
	static Node head;

	class Node {
		int data;
		Node next;

		Node(Node next, int data) {
			this.data = data;
			this.next = next;
		}
	}

	// function to get the middle of the linked list
	void printMiddle(Node head) {
		int count = 0;
		Node mid = head;

		while (head != null) {

			// update mid, when count is odd number
			if ((count % 2) == 1) {
				mid = mid.next;
			}
			++count;
			head = head.next;
		}

		// if empty list is provided
		if (mid != null) {
			System.out.println("The middle element is " + mid.data);
		}
	}

	void push(Node headRef, int newData) {
		Node newNode = new Node(headRef, newData);
		head = newNode;
	}

	void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + " -> ");
			head = head.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		FindMiddle3 llist = new FindMiddle3();

		for (int i = 5; i > 0; i--) {
			llist.push(head, i);
			llist.printList(head);
			llist.printMiddle(head);
		}

	}

}
