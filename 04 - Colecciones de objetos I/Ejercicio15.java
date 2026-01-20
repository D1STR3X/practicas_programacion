package rios.bermejo.gonzalo;

import java.util.Arrays;

public class Ejercicio15 {

	/*Dados 9 datos introducidos mediante argumentos de entrada, convertir cada uno de ellos a int e introducirlos en su respectiva posición de un array de 3x3, rellenando por
	filas y columnas, es decir el primer dato va a la primera fila, primera columna, el	segundo, a la primera fila, segunda columna, y así…. Mostrar el contenido de dicho array*/
	public static void main(String[] args) {
		int cont1;
		int cont2;
		int[][] a = new int [3][3];
		
		//Rellenamos el array con los valores de "args" del main
		for (cont1 = 0; cont1 < a.length; cont1++) {
			for (cont2 = 0; cont2 < a.length; cont2++) {
				a[cont1][cont2] = Integer.parseInt(args[cont1 * a.length + cont2]); 
			}
		}
		
		//Imprimimos el array
		System.out.println("    " + Arrays.toString(a[0]));
		System.out.println("A = " + Arrays.toString(a[1]));
		System.out.println("    " + Arrays.toString(a[2]));
	}
}