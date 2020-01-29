package lista;

public class Test {

	public static void main(String[] args) {
		
		Lista l = new Lista();
		
		l.addElementHead(8);
		l.addElementHead(5);
		l.addElementHead(27);
		l.addElementHead(1);
		l.addElementTail(100);
		
		System.out.println(l);
		System.out.println(l.getHead());
		System.out.println(l.getHead());
		System.out.println(l.getHead());
		System.out.println(l.getHead());
		System.out.println(l.getHead());
		System.out.println(l.getHead());
		System.out.println(l);
		

	}

}
