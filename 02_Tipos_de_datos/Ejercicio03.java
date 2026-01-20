package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio03 {
	
	//Crear un programa que pida un nombre y diga “Hola “ a ese nombre
	public static void main (String[]args) {
		System.out.println("¿Cuál es tu nombre?"); 
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		String nombre=leer.nextLine();
		System.out.println("Hola" + " " + nombre);
	}
}
