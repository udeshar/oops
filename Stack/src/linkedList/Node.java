package linkedList;

public class Node {
	private Integer data;
	private Node next;
	
	public Node(Integer data){
		super();
		this.setData(data);
		this.setNext(null);
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
