package genericTypes;

import lista2.Persona;

public class Test {

	public static void main(String[] args) {
		
		Pila<Libro> pLibros= new Pila<Libro>();
		Pila<Persona> pPersonas=new Pila<Persona>();
		
		pLibros.add(new Libro("El quijote","Cervantes"));
		pLibros.add(new Libro("Estructura de datos","Luis Joyanes"));

		System.out.println(pLibros.get());
		System.out.println(pLibros.get());
		System.out.println(pLibros.get());
		
		pPersonas.add(new Persona("Pedro","Martinez"));
		pPersonas.add(new Persona("Luis","Gonzalez"));
		pPersonas.add(new Persona("Carlos","Sanchez"));
		pPersonas.add(new Persona("Joaquin","Alonso"));
		
		System.out.println(pPersonas.get());
		System.out.println(pPersonas.get());
		System.out.println(pPersonas.get());
		System.out.println(pPersonas.get());
		System.out.println(pPersonas.get());
		
		

		
		
	}

}
