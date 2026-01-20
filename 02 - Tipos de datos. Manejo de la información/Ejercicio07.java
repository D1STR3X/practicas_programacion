package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio07 {

	//Crear un programa que pida dos números enteros (primero uno y luego otro) y muestre a continuación “la suma de <n1> y <n2> es <n1+n2>”
	public static void main (String[]args) {
		System.out.println("Dame un número");
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		int n1=leer.nextInt();
		System.out.println("Gracias, dame otro número");
		int n2=leer.nextInt();
		int n3 = n1 + n2;
		System.out.println("La suma de" + " " + n1 + " " + "y" + " " + n2 + " " + "es" + " " + n3);
	}
}