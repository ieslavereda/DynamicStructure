package genericTypes;

import lista2.Persona;

public class Test2 {

	public static void main(String[] args) {
		

		Persona p1 = new Persona("Pedro","Martinez");
		Persona p2 = new Persona("Luis","Gonzalez");
		Persona p3 = new Persona("Carlos","Sanchez");
		Persona p4 = new Persona("Joaquin","Alonso");

		Cola<Persona> cola = new Cola<Persona>();
		
		cola.add(p1);
		cola.add(p2);
		cola.add(p3);
		cola.add(p4);
		
		System.out.println(cola.get());
		System.out.println(cola.get());
		System.out.println(cola.get());
		System.out.println(cola.get());
		System.out.println(cola.get());
		

	}

}
