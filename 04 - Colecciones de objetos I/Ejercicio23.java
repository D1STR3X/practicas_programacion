package rios.bermejo.gonzalo;

import java.util.Arrays;

public class Ejercicio23 {

	/*Crear un método mezclar(a: int[], b: int[], modo: String):int[] que, dados dos arrays a y b, de tamaño indeterminado mezcle su contenido y 
	devuelva dicho contenido mezclado. 
	El modo en el que han de mezclarse ambos arrays se decidirá en función del contenido de la variable “modo”, 
	y pueden ser los siguientes: “delanteA”, “delanteB”, “cremalleraA”, “cremalleraB”. 
	Los dos primeros construyen el array a devolver 
	poniendo todos los elementos de “a” en primer lugar y después todos los de “b” o viceversa. 
	Los dos de tipo cremallera van construyendo el nuevo array alternando elementos de “a” con elementos de “b”, comenzando por un primer elemento 
	de “a” o de “b” en función del modo escogido.
	NOTA: Para primeras pruebas, asúmase que los arrays “a” y “b” son del mismo tamaño, pero el algoritmo finalmente debe funcionar para arrays
	de tamaños arbitrarios*/
	public static int[] mezclar (int[] a, int[] b, String modo) {
		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;
		boolean ciclo = false;
		boolean turno = true;

		//El tamaño del array resultante será la sumatoria del tamaño de los dos arrays operados
		int[] c = new int[a.length + b.length];
		
		//Con un switch separamos las acciones a realizar dependiendo del modo
		switch (modo) {
			case "delanteA":
				//Con un for guardamos en el array c todos los elementos del array a y luego con otro for guardamos los del b
				for (cont1 = 0; cont1 < a.length; cont1++) {
					c[cont1] = a[cont1];

				} 
				for (cont2 = 0; cont2 < b.length; cont2++) {
					c[a.length + cont2] = b[cont2];
				}
				break;
					
			case "delanteB":
				//Con un for guardamos en el array c todos los elementos del array b y luego con otro for guardamos los del a
				for (cont2 = 0; cont2 < b.length; cont2++) {
					c[cont2] = b[cont2];
				}
				for (cont1 = 0; cont1 < a.length; cont1++) {
					c[b.length + cont1] = a[cont1];
				}
				break;

			case "cremalleraA":
				//Con un for pasamos por cada posición del array c
				for (cont3 = 0; cont3 < c.length; cont3++) {
					//Con dos whiles que tienen de condición si es su turno (primero a, luego b) y si se ha completado un ciclo intercalamos los elementos de los dos arrays
					while (cont1 < a.length && turno == true && ciclo == false) {
						c[cont3] = a[cont1];
						turno = false;
						ciclo = true;
						cont1++;
						if (cont2 == b.length) {
							turno = true;
						}
					} 
					while (cont2 < b.length && turno == false && ciclo == false) {
						c[cont3] = b[cont2];
						turno = true;
						ciclo = true;
						cont2++;
						if (cont1 == a.length) {
							turno = false;
						}
					}
					ciclo = false;
				}
				break;
				
			case "cremalleraB":
				for (cont3 = 0; cont3 < c.length; cont3++) {
					//Con dos whiles que tienen de condición si es su turno (primero b, luego a) y si se ha completado un ciclo intercalamos los elementos de los dos arrays
					while (cont2 < b.length && turno == true && ciclo == false) {
						c[cont3] = b[cont2];
						turno = false;
						ciclo = true;
						cont2++;
						if (cont1 == a.length) {
							turno = true;
						}
					} 
					while (cont1 < a.length && turno == false && ciclo == false) {
						c[cont3] = a[cont1];
						turno = true;
						ciclo = true;
						cont1++;
						if (cont2 == b.length) {
							turno = false;
						}
					}
					ciclo = false;
				}
				break;
		}
		return c;
	}
	
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5};
		int b[] = {6, 7, 8, 9, 10, 11, 12, 13};
		String modo = "cremalleraB";
		
		//En el array c guardamos el resultado de mezclar los dos arrays iniciales del modo indicado
		int c[] = mezclar(a, b, modo);
		
		//Mostramos el array c
		System.out.println(Arrays.toString(c));
	}
}
