package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio23 {

	/*Indicar la suma de los dígitos de un número (ej. 178 = 1+7+8=16)
	○ Utilizar una variable “acc” (acumuladora) en la que vayamos acumulando la suma parcial de los distintos dígitos. “acc” comenzará valiendo 0, y le iremos sumando,
	en un bucle, la cifra de la posición de las unidades de “n”. Antes de salir del bucle, dividiremos “n” por 10 para que la posición que estaba en las decenas pase ahora a
	ser la de las unidades. Permaneceremos en el bucle hasta que n<0 (es decir que no queden más unidades que procesar)*/
	public static int sumaDigitos (int n) { //Creamos un método sumaDigitos para calcular la suma de los dígitos del número introducido 
		int acc = 0;
		while (n > 0) 
		{
			acc = acc + n % 10; //El acumulador será igual a su último valor sumado al resto de la división de n entre 10
	        n /= 10;
		}
		return acc;
	}
	
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		System.out.println("Introduce un número");
		int n1 = leer.nextInt();
		System.out.println("Suma de los dígitos: " + sumaDigitos(n1));
	}
}