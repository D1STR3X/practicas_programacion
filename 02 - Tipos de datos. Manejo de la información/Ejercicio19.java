package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio19 {
	
	/*Crear un método llamado “areaCirculo” que reciba un número que representa radio de un círculo y devuelva el área del mismo. Téngase en cuenta que tanto la longitud del
	radio así como el área puede precisarse utilizando números decimales. Hacer un programa que utilice este método para calcular el área de un círculo cuya longitud de radio proporcione 
	el usuario mediante el teclado*/
	public static double areaCirculo(double r) { //Método areaCirculo que calcula el area de un círculo cuando recibe el valor de su radio
		double л = 3.141592;
		double area = л*Math.pow(r,2);
		return area;
	}
	public static void main(String[]args) {
		System.out.println("Dame el radio de un circulo");
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		double r = leer.nextDouble();
		double area = areaCirculo(r); //Invocamos el método areaCirculo desde main
		System.out.println(area);
	}
}