package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio18 {
	
	/*Crear un método llamado “areaRectangulo” que reciba dos números que representan a los lados de un rectángulo y devuelva el área del mismo. Hacer un programa que utilice
	este método para calcular el área de un rectángulo cuya longitud de sus lados proporcione el usuario mediante el teclado*/
	public static int areaRectangulo (int n1, int n2) { //Método areaRectangulo que calcula el area de un rectangulo cuando recibe los valores de sus dos lados
		int area = n1 * n2;
		return area;
	}
	public static void main(String[]args) {
		System.out.println("Dame un lado de un rectángulo");
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		int n1 = leer.nextInt();
		System.out.println("Dame el otro lado de un rectángulo");
		int n2 = leer.nextInt();
		int area = areaRectangulo(n1,n2); //Invocamos el método areaRectangulo desde main
		System.out.println(area);
	}
}
