package lista2;

public class Test2 {

	public static void main(String[] args) {
		Lista l = new Lista();
		
		l.addElementHead(new Persona("Joaquin","Alonso"));
		l.addElementHead(new Persona("Pedro","Martinez"));
		l.addElementHead(new Persona("Luis","Gonzalez"));
		l.addElementHead(new Persona("Carlos","Sanchez"));
		
		
		
		Persona p = (Persona)l.getHead();
		System.out.println(p);
		
		// Error en tiempo de ejecucion
		Node n = (Node)l.getHead();
		System.out.println(n);

	}

}
