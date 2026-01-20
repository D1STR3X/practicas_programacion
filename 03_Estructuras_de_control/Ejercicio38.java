package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio38 {

	//Modificar el programa anterior, para que haga la “bajada de la montaña” también
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		System.out.println("Introduce un número mayor o igual a 1 y menor o igual a 20");
		int n = leer.nextInt();
		if (1 <= n && n <= 20) //Usamos un if else para separar los números que no cumplan con la condición establecida (1 <= n <= 20)
			{
				for (int c1 = 1; c1 <= n; c1++) //Usamos un for que se repita hasta que llegue al número introducido (n) con el que imprimiremos las filas de asteriscos ascendentes
				{
					for (int c2 = 1; c2 <= c1; c2++) //Usamos un for que se repita hasta que llegue a c1 con el que imprimiremos los asteriscos en una fila
					{
						System.out.print("*"); //Imprime un asterisco en la misma línea, formando una fila
					}
					System.out.println(); //Imprime un vacío en una nueva línea para iniciar la siguiente fila
				}
				for (int c1 = n - 1; c1 >= 1; c1--) //Usamos un for cuyo contador empiece desde n - 1 (para que no se repita el número máximo) y termine en 1, con el que imprimiremos las filas de asteriscos descendentes
				{
					for (int c2 = 1; c2 <= c1; c2++) //Usamos un for que se repita hasta que llegue a c1 con el que imprimiremos los asteriscos en una fila
					{
						System.out.print("*"); //Imprime un asterisco en la misma línea, formando una fila
					}
					System.out.println(); //Imprime un vacío en una nueva línea para iniciar la siguiente fila
				}
			} //Los dos for en conjunto forman una "montaña" de asteriscos que sube hasta el número introducido y luego vuelve a bajar 
		else 
			{
				System.out.println(n + " no cumple con los requisitos especificados");
			}
	}
}