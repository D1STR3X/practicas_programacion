package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio36 {

	//Dado un número n, dibujar una figura como ésta, consistente en un cuadrado de n x n asteriscos (tal que 1<= n <= 20)
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		System.out.println("Introduce un número mayor o igual a 1 y menor o igual a 20");
		int n = leer.nextInt();
		if (1 <= n && n <= 20) //Usamos un if else para separar los números que no cumplan con la condición establecida (1 <= n <= 20)
			{
				for (int contador2 = 1; contador2 <= n; contador2++) //Usamos un for que se repita hasta que llegue al número introducido (n) con el que imprimiremos las filas de asteriscos
				{
					for (int contador = 1; contador <= n; contador++) //Usamos otro for que se repita hasta que llegue al número introducido (n) con el que imprimiremos los asteriscos en una fila
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