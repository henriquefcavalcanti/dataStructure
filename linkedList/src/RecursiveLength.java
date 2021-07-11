// Recursive Java program to count number of nodes in a Linked List

public class RecursiveLength {
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
	public int getCountRec(Node node) {
		// base case
		if(node == null) {
			return 0;
		}
		
		// count is this node plus rest of the list
		return 1 + getCountRec(node.next);
	}
	
	// Wrapper over getCountRec()
	public int getCount() {
		return getCountRec(head);
	}
	
	public static void main(String[] args) {
		RecursiveLength llist = new RecursiveLength();
		llist.push(1);
        llist.push(3);
        llist.push(1);
        llist.push(2);
        llist.push(1);
        
        System.out.println("Count of nodes is " + llist.getCount());
	}

}








