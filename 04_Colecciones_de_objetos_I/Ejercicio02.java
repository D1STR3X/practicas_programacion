package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio02 {

	/*Igual que 1, pero quitando de la lista final, el máximo y el mínimo (suponiendo que todos los números introducidos son distintos), y mostrando también la media aritmética de
	todos ellos (incluyendo el máximo y el mínimo). PISTA: Hacer métodos que calculen el máximo, el mínimo y la media aritmética de un array hasta una posición determinada*/
	public static int max (int[] n, int cont) {
		int maximo = n[0];
	
		//Utilizamos un for para pasar por cada número del array
		for (int i = 0; i < cont; i++)
			{
				//Utilizamos un if para que cuando el número actual sea mayor al máximo guardado, este lo sustituya
				if (maximo < n[i])
				{
					maximo = n[i];
				}
			}
		return maximo;
	}
	
	public static int min (int[] n, int cont) {
		int minimo = n[0];

		//Utilizamos un for para pasar por cada número del array
		for (int i = 0; i < cont; i++)
			{
				//Utilizamos un if para que cuando el número actual sea menor al mínimo guardado, este lo sustituya
				if (minimo > n[i])
				{
					minimo = n[i];
				}
			}
		return minimo;
	}
	
	public static int media (int[] n, int cont) {
		int promedio;
		int suma = 0;
		
		//Usamos un for para pasar y sumar todos los elementos del array
		for (int i = 0; i < cont; i++)
			{
				suma += n[i];
			}
		
		//Calculamos el promedio en base a esa suma
		promedio = suma / cont;
		return promedio;
	}
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int[] a;
		a = new int[30];
		int c1 = 0;
		int c3 = 0;
		int n;
		
		//Utilizamos un do while para que pida los números
		do 
		{
			System.out.print("Dame un número distinto de 0 (" + (c1 + 1) + "/" + a.length + "): ");
			n = leer.nextInt();
			
			//Mientras el número ingresado sea distinto de 0, se guardará el número en el array
			if (n != 0)
				{
					a[c1] = n;
					c1++;
				}
		}
		while (c1 < a.length && n != 0); //Además de poner el límite de repeticiones del do while a 30, agregamos que n sea distinto de 0, para que cuando sea ingresado se salga del bucle
		
		//Utilizamos un for para mostrar los números ingresados, excluyendo los obtenidos al llamar los métodos max y min
		for (int c2 = 0; c2 < c1; c2++) 
		{
			if (a[c2] != max(a, c1) && a[c2] != min(a, c1))
				{
					System.out.print((c3 == 0 ? "" : ", ") + a[c2]);
					c3++;
				}
		}
		System.out.println("");
		
		//Mostramos la media de los números ingresados
		System.out.println("Media aritmética: " + media(a, c1));
	}
}