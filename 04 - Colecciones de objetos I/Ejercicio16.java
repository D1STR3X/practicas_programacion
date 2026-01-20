package rios.bermejo.gonzalo;

import java.util.Arrays;

public class Ejercicio16 {

	/*Dadas dos matrices 3x3 cuyos valores han sido introducidos por argumentos de entrada, mediante el siguiente formato: 
	a11,a12 a13 a21 a22 a23 a31 a32,a33 b11 b12 b13 b21 b22 b23 b31 b32 b33
	…por ejemplo, para introducir los datos de las matrices del ej. anterior
	1 2 3 4 5 6 7 8 9 9 8 7 6 5 4 3 2 1
	…mostrar el contenido de ambas matrices y el resultado de sumarlas y multiplicarlas*/
	public static void main(String[] args) {
		int cont1 = 0;
		int cont2 = 0;
		int[][] a = new int [3][3];
		int[][] b = new int [3][3];
		int[][] c = new int[3][3];
		int[][] d = new int[3][3];
		
		//Rellenamos los arrays con los valores de "args" del main
		for (cont1 = 0; cont1 < a.length; cont1++) {
			for (cont2 = 0; cont2 < a.length; cont2++) {
				a[cont1][cont2] = Integer.parseInt(args[cont1 * a.length + cont2]); 
			}
		}
		for (int cont3 = 0; cont3 < b.length; cont3++) {
			for (int cont4 = 0; cont4 < b.length; cont4++) {
				b[cont3][cont4] = Integer.parseInt(args[(cont1 * a.length + cont2 - 3) + cont3 * b.length + cont4]); 
			}
		}

		//Calculamos la suma de los dos arrays y lo guardamos en otro array
		for (cont1 = 0; cont1 < a.length; cont1++) {
			for (cont2 = 0; cont2 < b.length; cont2++) {
				c[cont1][cont2] = a[cont1][cont2] + b[cont1][cont2]; 
			}
		}

		//Calculamos la mutiplicación de los dos arrays y lo guardamos en otro array
		for (cont1 = 0; cont1 < a.length; cont1++) 	{
			for (cont2 = 0; cont2 < b.length; cont2++) {
				d[cont1][cont2] = a[cont1][0] * b[0][cont2] + a[cont1][1] * b[1][cont2] + a[cont1][2] * b[2][cont2]; 
			}
		}
		
		//Imprimimos los array
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
		System.out.println();
		System.out.println("            " + Arrays.toString(d[0]));
		System.out.println("A * B = D = " + Arrays.toString(d[1]));
		System.out.println("            " + Arrays.toString(d[2]));
	}
}