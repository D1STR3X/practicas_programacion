package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio40 {

	//Similar al 37, pero haciendo el triángulo a la inversa
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		System.out.println("Introduce un número mayor o igual a 1 y menor o igual a 20");
		int n = leer.nextInt();
		if (1 <= n && n <= 20) //Usamos un if else para separar los números que no cumplan con la condición establecida (1 <= n <= 20)
			{
				for (int c1 = 1; c1 <= n; c1++) //Usamos un for que se repita hasta que llegue al número introducido (n) con el que imprimiremos las filas de asteriscos ascendentes
				{
					for (int c2 = 1; c2 <= n - c1; c2++) //Usamos un for que se repita hasta que llegue a n - c1 con el que imprimiremos los espacios en blanco en una fila
					{
						System.out.print(" "); //Imprime un espacio en blanco en la misma línea
					} //Al ejercicio 37 le agregamos un for que imprima espacios en blanco antes del for que imprime los asteriscos, de esta forma logramos obtener el triángulo de asteriscos invertido
					for (int c3 = 1; c3 <= c1; c3++) //Usamos un for que se repita hasta que llegue a c1 con el que imprimiremos los asteriscos en una fila
					{
						System.out.print("*"); //Imprime un asterisco en la misma línea, formando una fila
					}
					System.out.println(); //Imprime un vacío en una nueva línea para iniciar la siguiente fila
				}
			}
		else 
			{
				System.out.println(n + " no cumple con los requisitos especificados");
			}
	}
}