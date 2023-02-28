//Java program to create a singly linked list of n nodes and count the number of nodes
package assignment;

public class SinglylinkedListCountNode {
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node head = null;
	private Node tail = null;

	public void addNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public int countNodes() {
		int count = 0;
		Node current = head;

		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of singly linked list: ");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		SinglylinkedListCountNode sList = new SinglylinkedListCountNode();
		sList.addNode(1);
		sList.addNode(2);
		sList.addNode(3);
		sList.addNode(4);
		sList.addNode(5);
		sList.addNode(6);
		sList.display();
		System.out.println("Count of nodes present in the list " + sList.countNodes());
	}
}