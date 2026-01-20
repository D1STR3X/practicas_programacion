package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio39 {

	//Modificar el programa anterior, para que dibuje m montañas de altura a.
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		System.out.println("Introduce un número mayor o igual a 1 y menor o igual a 20");
		int a = leer.nextInt();
		System.out.println("Introduce otro número mayor o igual a 1 y menor o igual a 20");
		int m = leer.nextInt();
		if (1 <= m && m <= 20 && 1 <= a && a <= 20) //Usamos un if else para separar los números que no cumplan con la condición establecida (1 <= a <= 20 y 1 <= m <= 20)
			{
				for (int c3 = 1; c3 <= m; c3++) //Usamos un for que se repita hasta que llegue a "m" con el que imprimiremos las "montañas" de asteriscos
				{
					for (int c1 = 1; c1 <= a; c1++) //Usamos un for que se repita hasta que llegue a "a" con el que imprimiremos las filas de asteriscos ascendentes
					{
						for (int c2 = 1; c2 <= c1; c2++) //Usamos un for que se repita hasta que llegue a c1 con el que imprimiremos los asteriscos en una fila
						{
							System.out.print("*"); //Imprime un asterisco en la misma línea, formando una fila
						}
						System.out.println(); //Imprime un vacío en una nueva línea para iniciar la siguiente fila
					}
					for (int c1 = a - 1; c1 >= 1; c1--) //Usamos un for cuyo contador empiece desde a - 1 (para que no se repita el número máximo) y termine en 1, con el que imprimiremos las filas de asteriscos descendentes
					{
						for (int c2 = 1; c2 <= c1; c2++) //Usamos un for que se repita hasta que llegue a c1 con el que imprimiremos los asteriscos en una fila
						{
							System.out.print("*"); //Imprime un asterisco en la misma línea, formando una fila
						}
						System.out.println(); //Imprime un vacío en una nueva línea para iniciar la siguiente fila
					}
				} //Agregando un for que engloble a los otros fors del anterior ejercicio logramos que se repitan las "montañas" hasta que su contador (c3) llegue a "m"
			}
		else 
			{
				System.out.println("Uno o los dos números introducidos no cumplen con los requisitos especificados");
			}
	}
}