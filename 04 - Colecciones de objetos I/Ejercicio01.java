package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio01 {

	/*Hacer un programa que pida por teclado números enteros (un máximo de 30, o hasta que se introduzca el cero). En ese momento el programa mostrará todos los números
	introducidos, separados por comas (excepto el último cero)*/
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int[] a;
		a = new int[30];
		int c1 = 1;
		int n;
		
		//Utilizamos un do while para que pida los números
		do 
		{
			System.out.print("Dame un número distinto de 0 (" + c1 + "/" + a.length + "): ");
			n = leer.nextInt();
			
			//Mientras el número ingresado sea distinto de 0, se guardará el número en el array
			if (n != 0)
				{
					a[c1 - 1] = n;
					c1++;
				}
		}
		while (c1 <= a.length && n != 0); //Además de poner el límite de repeticiones del do while a 30, agregamos que n sea distinto de 0, para que cuando sea ingresado se salga del bucle
		
		//Utilizamos un for para mostrar los números ingresados
		for (int c2 = 0; c2 < c1 - 1; c2++) 
		{
			System.out.print((c2 == 0 ? "" : ", ") + a[c2]);
		}
	}

}