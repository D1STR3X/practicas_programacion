package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio09 {
	/*Crear un programa que te pregunte el nombre y la edad y te conteste:
	<nombre>, eres mayor de edad ó bien...
	<nombre>, eres menor de edad,
	en función de si la edad introducida es mayor o igual a 18 años, o no */
	public static void main (String[]args) {
		System.out.println("¿Cuál es tu nombre?");
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		String nombre=leer.nextLine();
		System.out.println("¿Cuántos años tienes?");
		int edad=leer.nextInt(); 
		System.out.println(nombre + "," + " " + "eres" + " " + (edad>=18 ? "mayor de edad" : "menor de edad")); //Utilizamos un operador ternario para asignar un string de forma condicional a la edad proporcionada
	}
}
