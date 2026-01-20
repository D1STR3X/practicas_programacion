package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio08 {
	//Crear un programa que pida dos números enteros (primero uno y luego otro) y muestre a continuación “el mayor de <n1> y <n2> es <el mayor de los dos>”
	public static void main (String[]args) {
		System.out.println("Dame un número");
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		int n1=leer.nextInt();
		System.out.println("Gracias, dame otro número");
		int n2=leer.nextInt(); 
		System.out.println("El mayor de" + " " + n1 + " " + "y" + " " + n2 + " " + "es" + " " + (n1 > n2 ? n1 : n2));
	}
}
