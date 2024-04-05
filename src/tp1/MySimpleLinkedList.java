package tp1;

public class MySimpleLinkedList<T> {
	
	private Node<T> first;
	
	public MySimpleLinkedList() {
		this.first = null;
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null, null);
		tmp.setNext(this.first);
		this.first = tmp;
	}
	
	public T extractFront() {		
		if (!isEmpty()){
			T resutado = this.first.getInfo();
			Node<T> next =this.first.getNext();
			this.first=next;
			this.first.setPrevious(null);
			return resutado;
		}else return null;
	}

	public boolean isEmpty() {
		// TODO
		return false;
	}
	
	public T get(int index) {
		// TODO
		return null;
	}
	
	public int size() {
		// TODO
		return 0;
	}
	
	@Override
	public String toString() {
		// TODO
		return "";
	}
	
}
