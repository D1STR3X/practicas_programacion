package rios.bermejo.gonzalo;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio03 {

	/*Hacer un programa que pida por teclado las dos coordenadas de un par de vectores planos, y muestre a continuación su suma vectorial y su producto escalar
	Ejemplo:
	Introduce x1: -1
	Introduce y1: -3
	Introduce x2: 1
	Introduce y2: -1
	(-1,-3)+(1,-1)=(0,-4)
	(-1,-3).(1,-1)= 2
	Alternattivamente…
	[-1,-3]+[1,-1]=[0,-4]
	[-1,-3].[1,-1]= 2 */
	public static int[] sumaVect (int[][] a) {
		int [] suma;
		suma = new int[2];
		
		//Utilizamos un for para sumar las coordenadas x e y de los vectores guardados en el array, pero sin juntar sus resultados
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a.length; i++) {
				suma [j] += a[i][j];
			}
		}
			
		return suma;
	}
	
	public static int productoEsc (int[][] a) {
		int productoEsc1 = 1;
		int productoEsc2 = 1;
		
		//Utilizamos un for para multiplicar las coordenadas x e y de los vectores guardados en el array y los guardamos en dos variables separadas
		for (int i = 0; i < a.length; i++) {
			productoEsc1 *= a[i][0];
			productoEsc2 *= a[i][1];
		}
		
		//Sumamos los productos calculados para obtener el producto escalar
		int productoFin = productoEsc1 + productoEsc2;
			
		return productoFin;
	}
	
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in);
		int[][] a;
		a = new int[2][2];
		
		//Pedimos las coordenadas x e y para dos vectores y los guardamos en un array
		for (int cx = 0; cx < a[0].length; cx++) 
		{
			for (int cy = 0; cy < a.length; cy++) 
			{
				System.out.println("Dame la coordenada " + (cy == 0 ? "x" : "y") + (cx + 1));
				a[cx][cy] = leer.nextInt();
			}
		}
		
		//Mostramos la suma vectorial y el producto escalar de los vectores
		System.out.println("Suma vectorial: " + Arrays.toString(a[0]) + " + " + Arrays.toString(a[1]) + " = " + Arrays.toString(sumaVect(a)));
		System.out.println("Producto escalar: " + Arrays.toString(a[0]) + " * " + Arrays.toString(a[1]) + " = " + productoEsc(a)) ;
	}
}