package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio31 {

	/*Dado un par de números “n” y “k”, con n>k, mostrar el valor del número combinatorio, que se calcula de la siguiente manera:
	■ hacer un método “int fact(int n)” que calcule el factorial de un número n, basándose en el algoritmo del ejercicio anterior.
	■ Optimizar el cálculo observando el comportamiento de la fórmula*/
	public static long factorial (int n) { //Creamos un método factorial para calcular el factorial de un número
		long resultado = 1; //Ya que 0! es 1, el valor inicial de factorial será 1, además se usa un long ya que el valor de los factoriales sobrepasa el límite de int a partir del 13 
		for (int contador = 1; contador <= n; contador++) //Usamos un for para conseguir un contador desde el 1 hasta llegar al número introducido
		{
			resultado *= contador; //El valor del factorial será su último valor multiplicado por el contador
		}
		return resultado;
	}
	
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		System.out.println("Dame un número");
		int n = leer.nextInt();
		System.out.println("Dame otro número inferior a " + n);
		int k = leer.nextInt();
		if (k >= n)
			{
				System.out.println(k + "no es inferior a " + n);
			}
		else 
			{
				long respuesta = factorial(n)/(factorial(k)*factorial(n-k)); //Invocando el método factorial, calculamos el número combinatorio del par de números n y k
				System.out.println(respuesta);
			}
	}
}