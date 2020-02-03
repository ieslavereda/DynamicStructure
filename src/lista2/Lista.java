package lista2;

public class Lista {

	private int size;
	private Node head;

	public Lista() {
		size = 0;
		head = null;
	}

	public void addElementHead(Object num) {
		Node n = new Node(num);
		n.setSiguiente(head);
		head = n;
		size++;
	}

	public void addElementTail(Object num) {
		Node n = new Node(num), aux;

		if (head == null) {
			head = n;
		} else {
			aux = head;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(n);
		}
		size++;
	}

	public Object getHead() {
		if (head == null)
			return null;
		else {
			Object o = head.getInfo();
			head = head.getSiguiente();
			size--;
			return o;
		}
	}

	public String toString() {
		String salida = "Size = " + size + "\n";

		Node aux = head;

		while (aux != null) {
			salida += aux + "\n";
			aux = aux.getSiguiente();
		}

		return salida;
	}

}
