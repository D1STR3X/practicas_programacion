package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio20 {

	/*Dado un número entero mayor que cero, escribirlo en orden inverso. (ej. Dado 1234, mostraría 4321)
	○ Obtener las unidades de “n” observando el resto de dividir “n” por 10. Imprimir esas unidades por pantalla y repetir el proceso anterior pero trabajando con la décima
	parte de “n”*/
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		System.out.println("Introduce un número entero mayor a 0");
		int n1 = leer.nextInt();
		if (n1<=0) //Si el número es menor o igual a 0, se imprime que el número introducido no cumple con la condición especificada
			{
				System.out.println(n1 + " no es un número entero mayor a 0");
			}
		while (n1 > 0)
		{
			int digito = n1 % 10; //Obtenemos un dígito de n1
			System.out.print(digito); //Imprimimos el dígito obtenido en una misma línea
			n1 /= 10; //Sustituimos n1 con su valor divido entre 10 (no se conservan los decimales al ser un int)
		}
	}
}