package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio27 {

	/*Dados dos números a y b, mostrar los números primos que existen entre ellos.
	○ Hacer un bucle que recorra desde a hasta b y en cada vuelta consulte al método “primo” para decidir si lo debe mostrar o no*/
	public static boolean primo (int n) {
		boolean parar = true;
		int divisor = 2;
		if (n == 1)  //Los números primos deben tener 2 divisores, que correspoden al mismo número y al 1. Aunque el 1 cumple con ambas condiciones, solo tiene un divisor por lo que no es primo.
			{
				parar = false;
			}
		while (parar && divisor < n) //Usamos un while que funcione mientras el divisor sea menor al número (porque él siempre será divisor) y parar sea verdadero
		{
			if (n % divisor == 0) //Un if para los casos donde dividir n entre el divisor de igual a 0, es decir, que el divisor actual es un divisor de n1
				{
					parar = false;
				}
			divisor++; //Aumenta el valor actual de divisor en 1
		}
		return parar;
	}
	
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		System.out.println("Dame un número");
		int a = leer.nextInt();
		System.out.println("Dame otro número");
		int b = leer.nextInt();
		boolean respuesta = true;
		int contador;
		for (contador = a; contador <= b; contador++) //Utilizamos un for para obtener todos los números desde a hasta b
		{
			respuesta = primo(contador);
			if (respuesta == true) 
				{
					System.out.println(contador);
				}
		}
		for (contador = b; contador <= a; contador++) //Utilizamos un for para obtener todos los números desde a hasta b
		{
			respuesta = primo(contador);
			if (respuesta == true) 
				{
					System.out.println(contador);
				}
		}
	}
}