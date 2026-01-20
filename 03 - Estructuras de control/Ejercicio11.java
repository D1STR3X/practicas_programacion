package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio11 {	
	
	/*Mostrar los números IMPARES que existan entre un número n1 (cota inferior) y otro número n2 (cota superior), pudiendo ser n1 y n2 cualquier número, siempre y cuando n1
	<= n2 (n1 y n2 deben leerse desde el teclado)*/
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		System.out.println("Dame un número");
		int n1 = leer.nextInt();
		System.out.println("Dame un número mayor o igual a " + n1);
		int n2 = leer.nextInt();
		if (n2 < n1)
			{
				System.out.println(n2 + " no es mayor o igual a " + n1);
			}
		int contador = n1;
		while (contador <= n2) //Usamos un while para obtener los números desde n1 hasta n2
		{
			if (contador % 2 != 0) //Usamos un if para obtener los números que al ser dividos entre 2 nos den un resto distinto de 0, es decir, que son impares
				{
					System.out.println(contador);
				}
			contador++; //Aumenta el valor actual del contador en 1
		}
	}
}