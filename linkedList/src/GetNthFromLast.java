// Simple Java program to find n'th node from end of Linked List

public class GetNthFromLast {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// Function to get the nth node from the last of a Linked List
	void printNthFromLast(int n) {
		int len = 0;
		Node temp = head;

		// 1) count the number of nodes in Linked List
		while (temp != null) {
			temp = temp.next;
			len++;
		}

		// check if value of n is not more than length of the linked list
		if (len < n) {
			return;
		}
		
		temp = head;

		// 2) get the (len-n+1)th node from the beginning
		for (int i = 1; i < len - n + 1; i++) {
			temp = temp.next;
		}

		System.out.println(temp.data);
	}

	public void push(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}

	public static void main(String[] args) {
		GetNthFromLast llist = new GetNthFromLast();
		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(35);

		llist.printNthFromLast(2);
	}

}
