package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio34 {

	//Dado un número n, dibujar una figura como ésta, consistente en una columna de n asteriscos (tal que 1 <= n <= 20)
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		System.out.println("Introduce un número mayor o igual a 1 y menor o igual a 20");
		int n = leer.nextInt();
		if (1 <= n && n <= 20) //Usamos un if else para separar los números que no cumplan con la condición establecida (1 <= n <= 20)
			{
				for (int contador = 1; contador <= n; contador++) //Usamos un for que se repita hasta que llegue al número introducido (n)
				{
					System.out.println("*"); //Imprime un asterisco por línea, formando una columna
				}
			}
		else 
			{
				System.out.println(n + " no cumple con los requisitos especificados");
			}
	}
}