package lista2;

public class Node {
	
	private Object info;
	private Node siguiente;
	
	public Node(Object num) {
		this.info=num;
		this.siguiente=null;
	}
	
	public Object getInfo() {
		return info;
	}
	
	public Node getSiguiente() {
		return siguiente;
	}
	
	public void setSiguiente(Node siguiente) {
		this.siguiente=siguiente;
	}

	@Override
	public String toString() {
		return "" + info;
	}
	
}
