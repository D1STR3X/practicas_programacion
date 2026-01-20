package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio29 {

	/* Dado un número n, mostrar los n primeros términos de la serie de Fibonacci. La serie de Fibonacci, comienza por el cero, sigue por el uno, y los siguientes números se van
	calculando como la suma de los dos anteriores, es decir: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 …
	○ Arreglar un bucle en el que se vayan manteniendo los dos valores de la serie anteriores*/
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		System.out.println("Dame un número");
		int x = leer.nextInt();
		int n1 = 0; //a n1 le asignamos el primer valor de la serie de Fibonacci
		int n2 = 1; //a n2 le asignamos el segundo valor de la serie de Fibonacci
		for (int contador = 1; contador <= x; contador++) //Utilizamos un for para obtener números de la serie de Fibonacci hasta que el contador sea menor o igual a x 
		{
			System.out.println (n1); //Imprimimos n1
			int n3 = n1 + n2; //Sumamos el n1 y el n2 y asignamos su valor a n3
			n1 = n2; //Almacenamos el valor de n2 en n1
			n2 = n3; //Almacenamos el valor de n3 en n2
		} //La serie de Fibonacci empieza con 0 y 1, el tercer número será la suma de los dos anteriores, el cuarto será la suma del segundo y tercer número y así sucesivamente, por lo que a n3 le asignamos el valor de la suma de n1 + n2 
	}
}
