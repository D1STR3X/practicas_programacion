package rios.bermejo.gonzalo;

import java.util.Arrays;

public class Ejercicio12 {

	// Probar el algoritmo anterior desde un programa que recibe mediante los argumentos de entrada de main los elementos a ordenar.
	public static String[] burbuja(String[] datos) {
		String apoyo;
		
		//Utilizamos dos fors anidados para pasar por todos los elementos del array
		for (int cont1 = 0; cont1 < datos.length - 1; cont1++) {
			for (int cont2 = 0; cont2 < datos.length - 1; cont2++) {
				
				//Si el siguiente número del array es mayor al actual, intercambiamos sus posiciones
				if (Integer.parseInt(datos[cont2]) < Integer.parseInt(datos[cont2 + 1])) {
					apoyo = datos[cont2];
					datos[cont2] = datos[cont2 + 1];
					datos[cont2 + 1] = apoyo;
				}
			}
		}
		return datos;
	}
	
	public static void main(String[] args) {
		//Mostramos el array ordenado
		System.out.println(Arrays.toString(burbuja(args)));
	}
}