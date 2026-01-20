package main;

import metodos.metodos;
import persona.Persona;

public class ASCII {
	public static void main(String[] args) {
		for (int cont = 128; cont <= 255; cont++) {
			System.out.println(cont + " -> " + (char) cont);
		}
		
		System.out.println(metodos.esPalindromo("asa"));
		
		Persona placeholder = new Persona("Gonzalo", "Ríos", "Bermejo", "Peruana");
        System.out.println(placeholder);
	}
}
