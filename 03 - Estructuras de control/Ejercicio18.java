package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio18 {

	/*Leer números, permitiendo únicamente que el recién leído sea distinto de cero y mayor que el anterior. En caso contrario se debe detener el programa.
	○ Igual que 6, pero la condición de permanencia en el bucle, debe incluir que “n” sea distinto de cero. Además, antes de entrar en el bucle se deberá comprobar que “n”
	sea distinto de cero con un “if”*/
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		System.out.println("Introduce un número");
		int n1 = leer.nextInt();
		int ant = n1;
		if (n1 != 0)
		{
			do 
			{
				ant = n1;
				System.out.println("Introduce un número e intenta salir del bucle");
				n1 = leer.nextInt();
			}
			while (n1 > ant && n1 != 0);
			System.out.println("Saliste del bucle");
		}
		else System.out.println("Evitaste el bucle");
	}
}