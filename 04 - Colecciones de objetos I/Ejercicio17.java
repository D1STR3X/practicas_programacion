package rios.bermejo.gonzalo;

import java.util.Arrays;

public class Ejercicio17 {
	
	//Igual que el ejercicio anterior pero para matrices de tamaño NxN
	public static void main(String[] args) {
		int cont1 = 0;
		int cont2 = 0;
		int tam = Integer.parseInt(args[0]);
		int[][] a = new int [tam][tam];
		int[][] b = new int [tam][tam];
		int[][] c = new int[tam][tam];
		int[][] d = new int[tam][tam];
		
		//Rellenamos los arrays con los valores de "args" del main
		for (cont1 = 0; cont1 < a.length; cont1++) {
			for (cont2 = 0; cont2 < a.length; cont2++) {
				a[cont1][cont2] = Integer.parseInt(args[cont1 * a.length + cont2]); 
			}
		}
		for (int cont3 = 0; cont3 < b.length; cont3++) {
			for (int cont4 = 0; cont4 < b.length; cont4++) {
				b[cont3][cont4] = Integer.parseInt(args[((cont1 - 1) * a.length + cont2) + cont3 * b.length + cont4]); 
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