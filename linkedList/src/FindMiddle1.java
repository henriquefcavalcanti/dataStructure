// Java program to find middle of linked list

public class FindMiddle1 {
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

	void printMiddle() {
		int count = 0;
		Node aux = head;
		Node middle = head;

		while (aux != null) {
			count++;
			aux = aux.next;
		}

		for (int i = 0; i < count / 2; i++) {
			middle = middle.next;
		}
		
		System.out.println(middle.data);

	}
	
	public static void main(String[] args) {
		FindMiddle1 llist = new FindMiddle1();
		for (int i=5; i>0; --i)
        {
            llist.push(i);
            llist.printMiddle();
        }
	}

}
