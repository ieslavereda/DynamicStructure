package genericTypes;

public class Cola<T> {
	
	private int size;
	private Nodo<T> head;
	private Nodo<T> tail;
	
	public Cola() {
		size=0;
		head=null;
		tail=null;
	}
	
	public T get() {
		if(head==null)
			return null;
		else if(head==tail) {
			T info = head.getInfo();
			head=null;
			tail=null;
			size--;
			return info;
		}else {
			T info = head.getInfo();
			head=head.getNext();
			size--;
			return info;
		}
	}
	
	public void add(T info) {
		
		Nodo<T> n = new Nodo<T>(info);
		
		if(head==null) {
			head=n;
			tail=n;
		}else {
			tail.setNext(n);
			tail=n;
		}
		
		size++;
	}
	
	

}
