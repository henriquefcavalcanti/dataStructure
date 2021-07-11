// Java program to count number of nodes in a Linked List

public class IteractiveLength {
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

	// Returns count of nodes in Linked List
	public int getCount() {
		int count = 0;

		Node temp = head;
		while (temp!= null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public static void main(String[] args) {
		IteractiveLength llist = new IteractiveLength();
        llist.push(1);
        llist.push(3);
        llist.push(1);
        llist.push(2);
        llist.push(1);
        
        System.out.println("Length = " + llist.getCount());
	}

}
