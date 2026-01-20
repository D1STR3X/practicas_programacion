package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio30 {

	/* Dado un número mostrar n! (n! = n (n-1) (n-2) ….. 1 ). Téngase en cuenta que 0! = 1
	○ Utilizar una variable “acc” acumuladora de las multiplicaciones parciales, que comience valiendo 1 y se actualice dentro de un bucle que vaya desde 1 hasta n.
	Mirar las formas de optimizar dicho bucle.*/
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		System.out.println("Dame un número");
		int numero = leer.nextInt();
		long factorial = 1; //Ya que 0! es 1, el valor inicial de factorial será 1, además se usa un long ya que el valor de los factoriales sobrepasa el límite de int a partir del 13 
		for (int contador = 1; contador <= numero; contador++) //Usamos un for para conseguir un contador desde el 1 hasta llegar al número introducido
		{
			factorial *= contador; //El valor del factorial será su último valor multiplicado por el contador
		}
		System.out.println(factorial); //Imprimimos el resultado del factorial
	}
}