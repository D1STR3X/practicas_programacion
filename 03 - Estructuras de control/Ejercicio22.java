package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio22 {

	/*D Indicar si un número entero mayor que cero, introducido, es capicúa.
	○ Aprovechando la experiencia de los dos ejercicios anteriores crear un método “int reves(int n)” que devuelva el inverso de un número (no que lo muestre por pantalla,
	sino que lo devuelva).
	○ Para hacer el método “int reves (int n)”, la estrategia es un poco distinta del ejercicio que tan sólo lo mostraba. Lo que hay que hacer es ir dividiendo el número
	por 10, y sumarle el resto a 10*inverso que hayamos calculado hasta el momento.
	○ Para ver que “n” sea capicúa basta con que n sea igual a reves(n)*/
	public static int reves (int n) { //Creamos un método reves para obtener el número con sus cifras invertidas
		int resultado = 0;
		while (n > 0) 
		{
			resultado = resultado * 10 + n % 10; //El resultado será igual a él mismo multiplicado por 10 sumado al resto de la divisón de n entre 10 
	        n /= 10; //n es sustituido por su décima parte (no se conservan decimales al ser n un int)
		}
		return resultado;
	}
	
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		System.out.println("Introduce un número entero mayor a 0");
		int n1 = leer.nextInt();
		if (n1 <= 0) //Usamos un if else para comprobar que el número establecido cumpla con la condición establecida
			{
				System.out.println(n1 + " no es un número entero mayor a 0");
			}
		else 
			{
			if (n1 == reves(n1)) //Usamos un if else para comprobar que el número introducido es capicua
				{
					System.out.println("Es capicua");	
				}
			else 
				{
				System.out.println("No es capicua");
				}
			}
	}
}