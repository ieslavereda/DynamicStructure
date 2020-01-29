package lista;

public class Node {
	
	private int info;
	private Node siguiente;
	
	public Node(int num) {
		this.info=num;
		this.siguiente=null;
	}
	
	public int getInfo() {
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
