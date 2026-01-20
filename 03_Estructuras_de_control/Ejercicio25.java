package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio25 {

	/*Dado un número mayor que cero, indicar si es primo o no.
	○ Hacer un bucle que vaya desde 2 hasta n-1 (ya que cualquier número es divisible por la unidad y por sí mismo) , comprobando que el resto de dividir n por i (siendo i
	el contador del bucle), sea distinto de cero, ya que en caso contrario sería divisible y por tanto no primo. Evaluar con una variable booleana si el número ha
	permanecido siendo primo durante todas las vueltas del bucle.*/
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		System.out.println("Introduce un número mayor a 0");
		int n1 = leer.nextInt();
		boolean parar = true;
		int divisor = 2;
		if (n1 <= 0)
			{
				System.out.println(n1 + " no es mayor a 0");
			}
		else 
			{
			if (n1 == 1)  //Los números primos deben tener 2 divisores, que correspoden al mismo número y al 1. Aunque el 1 cumple con ambas condiciones, solo tiene un divisor por lo que no es primo.
				{
					parar = false;
				}
			while (parar && divisor < n1) //Usamos un while que funcione mientras el divisor sea menor al número (porque él siempre será divisor) y parar sea verdadero
			{
				if (n1 % divisor == 0) //Un if para los casos donde dividir n1 entre el divisor de igual a 0, es decir, que el divisor actual es un divisor de n1
					{
						parar = false;
					}
				divisor++; //Aumenta el valor actual de divisor en 1
			}
			if (parar == true)
				{
					System.out.println("Es primo");
				}
			else 
				{ 
					System.out.println("No es primo");
				}
			}
	}
}