package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio03 {

	//Dado un número, indicar por pantalla si es par o impar
	public static void main(String[] args) {
		int numero;
		System.out.println("Dame un número");
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		numero = leer.nextInt();
		if (numero % 2 == 0)
			{
				System.out.println("Número par");
			}
		else 
			{
				System.out.println("Número impar");
			}
	}
}
