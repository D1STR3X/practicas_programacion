package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio16 {

	/*Leer números por teclado de manera que al escribir el número 0, pare el proceso y se dejen de leer números.
		○ Utilizar un bucle do..while, que lea un número “n” y permanezca en el bucle si n es distinto a cero*/
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		int n1;
		do 
		{
			System.out.println("Introduce un número e intenta salir del bucle");
			n1 = leer.nextInt();
		}
		while (n1 != 0);
		System.out.println("Saliste del bucle");
	}
}