package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio21 {

	/*Dado un número entero mayor que cero, indicar cuántos dígitos tiene.
	○ Introducir el número en un bucle e irlo dividiendo por 10 hasta que sea menor que cero. Llevar un contador para ver cuántas vueltas se dan al bucle. Ese número será
	el número de cifras.*/
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		System.out.println("Introduce un número entero mayor a 0");
		int n1 = leer.nextInt();
		int numDigitos = 0;
		if (n1 <= 0) //Si el número es menor o igual a 0, se imprime que el número introducido no cumple con la condición especificada
			{
				System.out.println(n1 + " no es un número entero mayor a 0");
			}	
		else  //Necesitamos usar un if else ya que sin él se imprimira que el número introducido (que era menor o igual a 0) tiene 0 dígitos
			{
			while (n1 > 0)
			{
				n1 /= 10; //Reducimos las cifras de n1 en 1 (ya que no se conservan los decimales al ser n1 un int)
				numDigitos++; //Aumenta el número de numDigitos en 1
			}
			System.out.println("Número de dígitos: " + numDigitos);
			}
	}
}