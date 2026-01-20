package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio09 {

	/*Hacer un programa que implemente la clase Persona, con atributos nombre y apellido y método saludar() que muestre “Hola, soy <nombre> <apellido>”. Coleccionar datos de Persona’s 
	a través de args, indicando en el primer parámetro el número de personas a coleccionar y en el resto sus nombres y apellidos, y al finalizar, hacer que todas ellas saluden. */
	public static String[] saludar (String[] np) {
		int cont4 = 0;
		String[] saludo;
		saludo = new String [Integer.parseInt(np[0])];
		for (int cont3 = 1; cont3 < np.length; cont3 += 2) {
			saludo[cont4] = "Hola, soy " + np[cont3] + " " + np[cont3 + 1];
			cont4++;
			}
		return saludo;
	}	
	public static void main(String[] args) {
		//Pido el número de veces que vamos a saludar
		int cont2 = 1;
		Scanner leer = new Scanner(System.in);
		System.out.println("¿Cuántas veces vamos a saludar?");
		int n = leer.nextInt();
		
		//El tamaño del array será el número de saludos por 2 (nombre y apellido) + 1 (para guardar el número de saludos)
		args = new String[n * 2 + 1];
		args [0] = Integer.toString(n);
		
		//Utilizamos un for para pedir los nombres y apellidos de las personas que saludaremos
		for (int cont1 = 1; cont1 <= n; cont1++) {
			System.out.println("Dame el nombre " + (cont1));
			args [cont2] = leer.next();
			cont2++;
			System.out.println("Dame el apellido " + (cont1));
			args [cont2] = leer.next();
			cont2++;
		}
		
		//Invocamos el método saludar y cuadramos todos los elementos resultantes en un array
		String[] saludo = saludar(args);
		
		//Imprimimos los saludos con un for
		for (int cont5 = 0; cont5 < saludo.length; cont5++) {
			System.out.println(saludo [cont5]);
		}
	}
}