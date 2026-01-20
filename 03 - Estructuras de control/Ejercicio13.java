package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio13 {

	//Pedir un número por teclado y mostrar la tabla de multiplicar de ese número (utilizando una sola sentencia “print”
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		System.out.println("Dame un número");
		int n1 = leer.nextInt();
		int contador;
		for (contador = 0; contador <= n1*10; contador+=n1) //Utilizamos un for para obtener los múltiplos de n1 hasta llegar a n1*10
		{
			System.out.println(contador); //Imprime los múltiplos de n1 que vamos obteniendo por el for
		}	
	}
}
