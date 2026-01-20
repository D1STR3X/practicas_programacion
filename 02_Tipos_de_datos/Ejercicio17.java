package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio17 {

	//Utilizar el método “par” del ejercicio anterior para evaluar si un número introducido por el teclado es par o impar
	public static boolean par(int número) { //Método par que recibe un número y dice si es (true) o no es (false) par
		boolean resultado = (número % 2 == 0) ? true : false; //Utilizamos un operador ternario para identificar si el número es par
		return resultado;
	}
	public static void main(String[]args) {
		System.out.println("Dame un número");
		Scanner leer = new Scanner (System.in); //Utilizamos la clase Scanner importada del java.util package
		int número = leer.nextInt();
		boolean resultado = par(número); //Invocamos el método par desde main
		System.out.println(resultado);
	}
}