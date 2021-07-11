// A complete working Java program to delete a node in a linked list at a given position

public class DeleteGivenPosition {

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

	// Given a reference (pointer to pointer) to the head of a list and a position,
	// deletes the node at the given position
	public void deleteNode(int position) {

		if (head == null) { // if linked list is empty
			return;
		}

		Node temp = head; // Store head node

		if (position == 0) { // if head needs to be removed
			head = head.next;
			return;
		}

		// find previous node of the node to be deleted
		for(int i = 0; temp!=null && i<position-1;i++) {
			temp = temp.next;
		}
		
		// if position is more than number of nodes
		if(temp == null||temp.next == null) {
			return;
		}
		
		//Node temp->next is the node to be deleted
		// store pointer to the next of node to be deleted
		Node next = temp.next.next;
		temp.next = next; // unlink the deleted node from list
		
	}

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public static void main(String[] args) {
		DeleteGivenPosition llist = new DeleteGivenPosition();
		
		llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);
        llist.push(8);
        
        System.out.println("Created Linked List is: ");
        llist.printList();
        
        llist.deleteNode(2); // delete node at position 4
        
        System.out.println("\n Linked List after Deletion at position 2:");
        llist.printList();
        
	}







}
