package rios.bermejo.gonzalo;

public class Ejercicio06 {

	//Hacer un programa que dado un array “a” y número “n” muestre el primer elemento del array “a” y todos los que pueda del resto, saltando de n en n elementos.
	public static void main(String[] args) {
		int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int n = 3;
		
		//Usamos un for que aumenta el contador en n, "saltando" de n en n elementos y mostrándolos
		for (int cont = 0; cont < a.length; cont += n)
		{
			System.out.println(a[cont]);
		}
	}
}