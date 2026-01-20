package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio01 {

	//Dado un número escribir “Demasiado joven” o “Viejales” en función de que dicho número sea menor o igual que tu edad o estrictamente mayor
	public static void main(String[] args) {
		int ref = 19;
		int edad;
		System.out.println("Dime tu edad");
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		edad = leer.nextInt();
		if (edad <= ref) //Utilizamos la sentencia if para comparar la edad proporcionada con mi edad
			{
				System.out.println("Demasiado joven"); //resultado si la condición es verdadera
			}
		else 
			{
				System.out.println("Viejales"); //Con else proporcionamos un resultado si la condición es falsa
			}
	}
}
