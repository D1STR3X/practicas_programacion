package rios.bermejo.gonzalo;

import java.util.Arrays;

public class Ejercicio13 {

	//Dadas dos matrices de 3x3 “a” y “b” mostrar su contenido y el contenido de la matriz resultante de sumar ambas matrices.
	public static void main(String[] args) {
		int cont1;
		int[][] a = {{1,2,3}, {2,3,4}, {3,4,5}};
		int[][] b = {{3,2,1}, {2,1,2}, {1,2,3}};
		int[][] c = new int [3][3];
		
		//Calculamos la suma de los dos arrays y lo guardamos en otro array
		for (cont1 = 0; cont1 < a.length; cont1++) {
			for (int cont2 = 0; cont2 < b.length; cont2++) {
				c[cont1][cont2] = a[cont1][cont2] + b[cont1][cont2]; 
			}
		}

		//Imprimimos el array
		System.out.println("    " + Arrays.toString(a[0]));
		System.out.println("A = " + Arrays.toString(a[1]));
		System.out.println("    " + Arrays.toString(a[2]));
		System.out.println();
		System.out.println("    " + Arrays.toString(b[0]));
		System.out.println("B = " + Arrays.toString(b[1]));
		System.out.println("    " + Arrays.toString(b[2]));
		System.out.println();
		System.out.println("            " + Arrays.toString(c[0]));
		System.out.println("A + B = C = " + Arrays.toString(c[1]));
		System.out.println("            " + Arrays.toString(c[2]));
	}
}