package main;

import personas.Persona;

public class Prueba {

	public static void main(String[] args) {
		Persona pepe = new Persona ("Gonzalo", 19);
		pepe.saludar();
		pepe.despedirse();
		System.out.println();
		
		
		String nombrePepe = pepe.getNombre();
		int edadPepe = pepe.getEdad();
		System.out.println("Nombre: " + nombrePepe);
		System.out.println("Edad: " + edadPepe);
		System.out.println();
		
		
		pepe.setNombre("Pepe");
		pepe.setEdad(20);
		nombrePepe = pepe.getNombre();
		edadPepe = pepe.getEdad();
		System.out.println("Nombre: " + nombrePepe);
		System.out.println("Edad: " + edadPepe);
		System.out.println();
		
		Persona ana = new Persona("Ana", 18);
		ana.saludar();
		pepe.saludar();
		System.out.println();
		
		Persona aux = pepe;
		aux.saludar();
		//2 objetos, aux solo apunta al mismo objeto que pepe
		
		ana = aux;
		ana.saludar();
		//Ahora ana, pepe y aux apuntan al mismo objeto. El objeto al que apuntaba ana ahora queda sin referencias y es considerado basura
	}

}
