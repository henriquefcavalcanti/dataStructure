// Java program to count occurrences in a linked list

public class NumberOfOccurs1 {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	void push(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}

	int count(int value) {
		int count = 0;
		Node n = head;

		while (n != null) {
			if (n.data == value) {
				count++;
			}
			n = n.next;
		}

		return count;
	}

	public static void main(String[] args) {
		NumberOfOccurs1 llist = new NumberOfOccurs1();

		llist.push(1);
		llist.push(2);
		llist.push(1);
		llist.push(3);
		llist.push(1);

		System.out.println("Count of 1 is " + llist.count(1));

	}

}
