package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio05 {
	
	//Dada una letra indicar si es una vocal o una consonante
	public static void main(String[] args) {
		System.out.println("Dame una letra");
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		String letra = leer.nextLine();
		switch (letra) { //Utilizamos la sentencia switch para identificar si la letra introducida es vocal o consonante
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
				System.out.println("Vocal"); //Agrupamos 5 cases, cada uno con una vocal, y hacemos que cuando se introduzca una de esas letras se imprima vocal 
				break;
			default:
				System.out.println("Consonante"); //Como default (cualquier otro caso) hacemos que imprima consonante
		}
	}
}
