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

	public boolean contains(int num) {
		boolean encontrado = false;

		Node aux = head;

		while (aux != null && !encontrado) {
			if (aux.getInfo() == num)
				encontrado = true;
			else
				aux = aux.getSiguiente();

		}

		return encontrado;
	}

	public Integer getHead() {
		if (head == null)
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
		Node aux;

		if (head == null)
			return null;
		else if (head.getSiguiente() == null) {
			num = new Integer(head.getInfo());
			head = null;
			size--;
			return num;
		} else {
			aux = head;
			while (aux.getSiguiente().getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			num = new Integer(aux.getSiguiente().getInfo());
			aux.setSiguiente(null);
			size--;
			return num;
		}
	}

	public boolean delete(int num) {
		
		Node aux;
		
		if(head==null)
			return false;
		else if (head.getSiguiente()==null) {
			if(head.getInfo()==num) {
				head = null;
				size--;
				return true;
			}else {
				return false;
			}				
		}else {
			if(head.getInfo()==num) {
				head=head.getSiguiente();
				size--;
				return true;
			}else {
				aux=head;
				while(aux.getSiguiente()!=null && aux.getSiguiente().getInfo()!=num) {
					aux=aux.getSiguiente();
				}
				if(aux.getSiguiente()==null) {
					return false;
				}else {
					aux.setSiguiente(aux.getSiguiente().getSiguiente());
					size--;
					return true;
				}
			}			
		}
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
