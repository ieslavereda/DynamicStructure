package genericTypes;

public class Pila<T> {

	private int size;
	private Nodo<T> head;
	
	public Pila() {
		size=0;
		head=null;
	}
	
	public void add(T info) {
		
		Nodo<T> n = new Nodo<T>(info);
		
		if(head==null)
			head = n;
		else {
			n.setNext(head);
			head=n;
		}
		
		size++;
	}
	
	
}
