package model;

public class Node {
	private int value;
	private Node next;
	private Node prev;
	private int pass;
	public Node() {
	
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public int getPass() {
		return pass;
	}

	public void setPass() {
		this.pass++;
	}
	
}
