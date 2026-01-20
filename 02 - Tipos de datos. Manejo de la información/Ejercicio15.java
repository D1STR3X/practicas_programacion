package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio15 {
	
	//Utilizar el método “maximo” del ejercicio anterior para calcular el máximo de dos números introducidos por el usuario desde el teclado
	public static int maximo (int n1, int n2) { //Método maximo que recibe dos números enteros y devuelve el mayor
		int max = (n1 > n2) ? n1 : n2; //Utilizamos un operador ternario para identificar el número mayor
		return max;
	}
	public static void main (String[]args){
		System.out.println("Dame un número");
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		int n1 = leer.nextInt();
		System.out.println("Dame otro número");
		int n2 = leer.nextInt();
		int max = maximo (n1, n2); //Invocamos el método maximo desde main
		System.out.println(max);
	}
}
