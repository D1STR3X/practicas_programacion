package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio02 {

	//Dado un número escribir “Buena edad”, “Demasiado joven” o “Viejales” en función de que dicho número sea igual, menor o mayor que nuestra edad
	public static void main(String[] args) {
		int ref = 19;
		int edad;
		System.out.println("Dime tu edad");
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		edad = leer.nextInt();
		if (edad < ref)
			{
				System.out.println("Demasiado joven");
			}
		else 
			{
			if (edad == ref)
				{
					System.out.println("Buena edad");
				}
			else 
				{
					System.out.println("Viejales");
				}
			}
	}
}