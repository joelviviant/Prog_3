package TP_LISTAS;

public class Node<T> {

	private T info;
	private Node<T> next;
	private Node<T> previous;

	public Node() {
		this.info = null;
		this.next = null;
		this.previous = previous;
	}
	
	public Node(T info, Node<T> next, Node<T> previous) {
		this.setInfo(info);
		this.setNext(next);
		this.setPrevious(previous);
	}

	public Node(T info, Object o) {
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public Node<T> getPrevious() {
		return previous;
	}

	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

}
