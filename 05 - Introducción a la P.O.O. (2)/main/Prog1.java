package main;

import java.util.Scanner;
import personas.Persona;

public class Prog1 {

	public static void main(String[] args) {
		String nombre;
		Scanner leer = new Scanner(System.in);
		
		do {
			System.out.println("Dame un nombre");
			nombre = leer.next();
			if (!(nombre.equals("s"))) {
				Persona placeholder = new Persona(nombre);
				placeholder.saludar();
			}
		}
		while (!(nombre.equals("s")));

	}

}
