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
		System.out.println("4->" + l.delete(4));
		System.out.println("1->" + l.delete(1));
		System.out.println("100->" + l.delete(100));
		System.out.println("5->" + l.delete(5));
		System.out.println("27->" + l.delete(27));
		System.out.println("8->" + l.delete(8));
		System.out.println("8->" + l.delete(8));
		System.out.println(l);


		

	}

}
