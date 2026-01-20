package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio28 {

	/*Dados dos números, indicar el máximo común divisor de ambos.
	○ Existen muchos algoritmos para calcular el mcd(x,y). Uno de los más populares es el algoritmo de Euclides que consiste en lo siguiente: Siendo x >= y (y si no los
	intercambiaremos), permaneceremos en un bucle mientras “y” sea distinto de cero. En cada vuelta del bucle “x” pasará a valer “y”, e “y” pasará a valer el resto de
	dividir “x” por “y”. Al terminar el bucle, el mcd será el último valor de “x”.*/
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		System.out.println("Dame un número");
		int n1 = leer.nextInt();
		System.out.println("Dame otro número");
		int n2 = leer.nextInt();
		int ant;
		if (n1 >= n2) 
			{
				while (n2 != 0) 
				{
					ant = n1; //Guardamos el valor de n1 en ant
					n1 = n2; //Guardamos el valor de n2 en n1
					n2 = ant % n2; //Dividimos el valor de ant entre n2 y el resto lo guardamos en n2
				}
				System.out.println("El máxmimo común divisor es " + n1); //Cuando el valor de n2 sea igual a 0, el valor de n1 será el máximo común divisor
			}
		else 
			{ 
				while (n1 != 0) 
				{
					ant = n2;
					n2 = n1;
					n1 = ant % n1;
				} 
				System.out.println("El máxmimo común divisor es " + n2); //Este es el mismo proceso, pero intercambiamos n1 y n2 para los casos donde n2 sea mayor a n1
			}
	}
}
