package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio17 {

	/*Leer números por teclado de manera que sólo permita que el recién leído sea mayor que el anterior. En el momento que esto no se cumpla el programa se detiene. La lectura del
	primer número siempre será exitosa, ya que no hay ningún número con el que compararlo.
	○ Hacer una primera lectura de “n” fuera del bucle. Utilizar un bucle do..while en el que, se guarde el valor de “n” en una variable “ant”, se lea el nuevo “n” y se
	permanezca en el bucle si n>ant*/
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		System.out.println("Introduce un número");
		int n1 = leer.nextInt();
		int ant = n1;
		do 
		{
			ant = n1;
			System.out.println("Introduce un número mayor a " + ant);
			n1 = leer.nextInt();
		}
		while (n1 > ant);
		System.out.println("El número introducido no es mayor a " + ant);
	}
}