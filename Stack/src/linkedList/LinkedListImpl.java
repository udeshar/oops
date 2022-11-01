package linkedList;

public class LinkedListImpl {
	
	private Node head, temp;
	
	public void insertAtBegining(Integer data) {
		if(head == null) {
			head = new Node(data);
		}
		else {
			temp = new Node(data);
			temp.next = head;
			head=temp;
		}
	}
	
	public void insertAtEnd(Integer data) {
		temp = new Node(data);
		Node temp2 = head;
		if(temp2 == null) {
			head = temp;
		} else {
			while(temp2.next != null) {
				temp2 = temp2.next;
			}
			temp2.next = temp;
		}
	}
	
	public Integer deleteAtEnd() {
		if(head != null) {
			Node temp2 = head;
			while(temp2.next != null) {
				temp = temp2;
				temp2 = temp2.next;
			}
			temp.next = null;
			return temp2.data;
		}
		else {
			System.out.println("Linked list is empty");
			return null;
		}
	}
	
	public void printList() {
		Node temp2 = head;
		if(temp2 == null) {
			System.out.println("list is empty");
		} else {
			while(temp2 != null) {
				System.out.println(temp2.data);
				temp2 = temp2.next;
			}
		}
	}
	
	public Integer deleteAtBegining() {
		if(head != null) {
			Node temp2 = head;
			head = temp2.next;
			return temp2.data;
		}
		else {
			System.out.println("Linked list is empty");
			return null;
		}
	}
	
	public Integer getTop() {
		if(head == null) {
			System.out.println("Empty");
			return null;
		} else {
			return head.data;
		}
	}
	
	public Integer getLast() {
		if(head == null) {
			System.out.println("Empty");
			return null;
		} else {
			Node temp2 = head;
			while(temp2.next != null) {
				temp2=temp2.next;
			}
			return temp2.data;
		}
	}
}
