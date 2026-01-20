package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio24 {

	/*Indicar la suma de los dígitos de un número (ej. 178 = 1+7+8=16)
	○ Utilizar una variable “acc” (acumuladora) en la que vayamos acumulando la suma parcial de los distintos dígitos. “acc” comenzará valiendo 0, y le iremos sumando,
	en un bucle, la cifra de la posición de las unidades de “n”. Antes de salir del bucle, dividiremos “n” por 10 para que la posición que estaba en las decenas pase ahora a
	ser la de las unidades. Permaneceremos en el bucle hasta que n<0 (es decir que no queden más unidades que procesar)*/
	public static int sumaDigitos (int n) { //Creamos un método sumaDigitos para calcular la suma de los dígitos del número introducido 
		int acc = 0;
		boolean impar = true;
		while (n > 0) 
		{
			int digito = n % 10;
			if (impar == true) //Usamos un if para que el acumulador solo se sumen los valores de los dígitos impares
				{
					acc += digito; //El acumulador es igual a la suma de su último valor sumado al valor del dígito
				}
			n /= 10; //usando el mismo código que el 23 pero cambiando la línea 15 por "n /= 100" obtendrìa el mismo resultado de sumar solo los dígitos impares y ya no haría falta el impar = !impar
			impar = !impar;
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