package lista;

public class Lista {

	private int size;
	private Node head;

	public Lista() {
		size = 0;
		head = null;
	}

	public void addElementHead(int num) {
		Node n = new Node(num);
		n.setSiguiente(head);
		head = n;
		size++;
	}
	public void addElementTail(int num) {
		Node n = new Node(num),aux;
		
		if(head==null) {
			head=n;
		}else {
			aux = head;
			while(aux.getSiguiente()!=null) {
				aux=aux.getSiguiente();
			}
			aux.setSiguiente(n);
		}		
		size++;
	}
	public boolean contains(int num) {
		boolean encontrado=false;
		
		Node aux = head;
		
		while(aux!=null && !encontrado) {
			if(aux.getInfo()==num)
				encontrado=true;
			else				
				aux=aux.getSiguiente();
			
		}
		
		return encontrado;
	}
	
	public Integer getHead() {
		if(head==null)
			return null;
		else {
			Integer num = new Integer(head.getInfo());
			head = head.getSiguiente();
			size--;
			return num;
		}			
	}
	
	public Integer getTail() {
		Integer num = null;
		
		if(head==null)
			return null;
		
		
	}

	public String toString() {
		String salida = "Size = " + size + "\n";

		Node aux = head;

		while (aux != null) {
			salida += aux + " ";
			aux = aux.getSiguiente();
		}

		return salida;
	}

}
