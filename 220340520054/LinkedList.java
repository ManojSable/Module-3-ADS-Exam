import java.util.*;
class LinkedList{
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	void addNode(int data)
	{
		Node new Node = new Node (data);
		if(head==null)
		{
			head = new Node;
		}
		else{
			Node temp = head;
			while (temp.next != null){
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	Node reverse(Node)
	{
		Node prev = null;
		Node current = node;
		Node next = null;
		
	}
}