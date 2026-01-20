package rios.bermejo.gonzalo;

public class Ejercicio05 {

	//Hacer un programa que muestre sólo los elementos de índices impares de un array.
	public static void main(String[] args) {
		int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		//Usamos un for que aumenta el contador de 2 en 2 y empieza desde el 0 (el elemento 1 del array) para mostrar solo los elementos impares del array
		for (int cont = 0; cont < a.length; cont += 2)
		{
			System.out.println(a[cont]);
		}
	}
}