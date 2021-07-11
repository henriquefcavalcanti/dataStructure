
public class LinkedList2 {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}
	
	public static void main(String[] args) {
		LinkedList2 llist = new LinkedList2();
		
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		llist.head.next = second;
		second.next = third;
		
		
		System.out.println(llist.head.data);
		System.out.println(llist.head.next.data);
		System.out.println(llist.head.next.next.data);
		
	}

}
