package rios.bermejo.gonzalo;

import java.util.Arrays;

public class Ejercicio11 {

	//Implementar el algoritmo de ordenación por el método de la burbuja, en un método estático cuyo prototipo es burbuja(int[ ] ):int[ ]
	public static void burbuja(int[] datos) {
		int apoyo;
		
		//Utilizamos dos fors anidados para pasar por todos los elementos del array
		for (int cont1 = 0; cont1 < datos.length - 1; cont1++) {
			for (int cont2 = 0; cont2 < datos.length - 1; cont2++) {
				
				//Si el siguiente número del array es mayor al actual, intercambiamos sus posiciones
				if (datos[cont2] < datos[cont2 + 1]) {
					apoyo = datos[cont2];
					datos[cont2] = datos[cont2 + 1];
					datos[cont2 + 1] = apoyo;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = {3, 1, 4, 2, 5, 8, 9, 7, 10, 6};
		burbuja(a);
		//Mostramos el array ordenado
		System.out.println(Arrays.toString(a));
	}
}