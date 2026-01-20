package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio19 {

	/*Leer números, permitiendo únicamente que el recién leído sea mayor que el anterior. En caso contrario se debe leer otro número. Detenerse cuando se introduzca el cero. Informar
	en cada número que se pida, a qué otro número debe superar.
	○ Igual que 8, excepto que la condición de permanencia en el bucle es únicamente que sea distinto de cero. Dentro del bucle, y después de leer el nuevo “n” se deberá
	comprobar con un if que n>ant, escribiendo por pantalla “n” si fuera cierto, y no haciendo nada en caso contrario.*/ //Siento que el if (n > ant) no tiene mucho sentido pero yo lo pongo
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		System.out.println("Introduce un número");
		int n1 = leer.nextInt();
		int ant = n1;
		do 
		{
			ant = n1;
			System.out.println("Introduce un número superior a " + n1);
			n1 = leer.nextInt();
			
			while (n1 <= ant && n1 != 0) 
			{
				System.out.println("Error, " + n1 + " no es superior a " + ant + ", vuelve a intentarlo");
				n1 = leer.nextInt();
			}
			if (n1 > ant)
			{
				System.out.println(n1);
			}
		}
		while (n1 != 0);
		System.out.println("Saliste del programa");
	}
}