package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio13 {

	//Utilizar el método “doble” del ejercicio anterior para calcular el doble de un número introducido por el usuario desde el teclado
	public static int doble (int número) { //Método doble que recibe un número entero y devuelve su doble
		int resultado = 2 * número;
		return resultado;
	}
	public static void main (String[]args) {
		System.out.println("Dame un número");
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		int número = leer.nextInt();
		int resultado = doble(número); //Invocamos el método doble desde main
		System.out.println(resultado);
	}
}
