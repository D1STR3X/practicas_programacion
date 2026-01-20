package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio04 {

	//Crear un programa que pida un nombre, después un apellido, y diga Hola <nombre> <apellido>, y después, en otra línea, Hola <apellido>, <nombre>
	public static void main (String[]args) {
		System.out.println("¿Cuál es tu nombre?");
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		String nombre=leer.nextLine();
		System.out.println("¿Cuál es tu apellido?");
		String apellido=leer.nextLine();
		System.out.println("Hola" + " " + nombre + " " + apellido);
		System.out.println("Hola" + " " + apellido + " " + nombre);
	}
}