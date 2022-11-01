package Stack;

import linkedList.LinkedListImpl;
import linkedList.Node;

public class StackImpl {
	private LinkedListImpl linkedList;
	Boolean insertAtBegining;
	
	public StackImpl(Boolean insertAtBegining){
		this.insertAtBegining = insertAtBegining;
		this.linkedList = new LinkedListImpl();
	}
	
	public void push(Integer data) {
		if(insertAtBegining) linkedList.insertAtBegining(data);
		else linkedList.insertAtEnd(data);
	}
	
	public Integer pop() {
		if(insertAtBegining) return linkedList.deleteAtBegining();
		else return linkedList.deleteAtEnd();
	}
	
	public Integer peek() {
		if(insertAtBegining) return linkedList.getTop();
		else return linkedList.getLast();
	}
	
	public void printStack() {
		linkedList.printList();
	}
}
