package node;

public class Node{
	public Node next = null;
	public int data;
	public Node(int d) {
		data = d;
	}
	public void insertAtTail(int d) {
		Node end = new Node(d);
		Node n = this;
		while(n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
	public Node deleteNode(Node head, int d) {
		Node n = head;
		if (n.data == d) {
			return head.next;
		}
		while (n.next != null) {
			if (n.next.data == d) {
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		return n;
	}
	public void display() {
		Node n = this;
		while(n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
}