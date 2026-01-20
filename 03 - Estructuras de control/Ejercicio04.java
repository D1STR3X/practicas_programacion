package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio04 {

	/*Dado un número, mostrar por pantalla su nombre (es decir, si es 1, “UNO”, si es 2, “DOS” si es 3, “TRES”, y si es cualquier otro número que muestre “NO SÉ). 
	Hacer una versión alternativa utilizando “switch”*/
	public static String metodo1 (int numero) { //Creamos el método metodo1 para mostrar el nombre del número dado utilizando if else anidado
		String resultado;
		if (numero == 1)
			{
				resultado = "UNO";
			}
		else 
			{
				if (numero == 2)
					{
						resultado = "DOS";
					}
				else 
					{
						if (numero == 3)
							{
								resultado = "TRES"; 
							}
						else 
							{
								resultado = "NO SÉ"; //Usamos un if else anidado para los 4 casos posibles, el UNO, DOS, TRES y NO SÉ	
							}
					}
			}
		return resultado;
	}
	
	public static String metodo2 (int numero) { //Creamos el método metodow para mostrar el nombre del número dado utilizando switch
		String resultado;
		switch (numero) {
			case 1: 
				resultado = "UNO";
				break;
			case 2: 
				resultado = "DOS";
				break;
			case 3:
				resultado = "TRES";
				break;
			default:
				resultado = "NO SÉ"; //Con switch logramos representar los 4 casos posibles de forma similar al if else, pero ocupando menos líneas y visualmente se ve más ordenada
				
		}
		return resultado;
	}
	public static void main(String[] args) {
		System.out.println("Dame un número");
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		int numero = leer.nextInt();
		String resultado;
		resultado = metodo1(numero);
		System.out.println(resultado);
		resultado = metodo2(numero);
		System.out.println(resultado);
	}
}