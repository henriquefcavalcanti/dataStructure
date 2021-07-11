
// Java program to find n'th node in Linked List

public class GetNthNode {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	// Takes index as argument and return data at index
	public int GetNth(int index) {
		Node current = head;
		int count = 0;

		while (current != null) {
			if (count == index) {
				return current.data;
			}
			count++;
			current = current.next;
		}

		// if we got to this line, the caller was asking for a non-existent element so
		// we assert fail
		assert (false);
		return 0;
	}

	public void push(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}

	public static void main(String[] args) {
		GetNthNode llist = new GetNthNode();

		llist.push(1);
		llist.push(4);
		llist.push(1);
		llist.push(12);
		llist.push(1);

		System.out.println("Element at index 3 is " + llist.GetNth(3));
	}

}
