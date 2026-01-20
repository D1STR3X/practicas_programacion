package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio15 {

	//Pedir un número por teclado y mostrar las tablas de multiplicar desde el 1 hasta ese número introducido (utilizando una sola sentencia “print”)
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		System.out.println("Dame un número");
		int n3 = leer.nextInt();
		for (int n1 = 1; n1 <= n3; n1++) //Utilizamos un for para obtener los números del 1 al n3, valores que serán asignados a n1
		{
			for (int n2 = 0; n2 <= n1*10; n2+=n1) //Utilizamos otro for para obtener los múltiplos de n1 hasta llegar a n1*10, valores que serán asignados a n2
			{
				System.out.println(n2); //Imprimimos los múltiplos de n1 que vamos obteniendo por el for
			}
		}
	}
}