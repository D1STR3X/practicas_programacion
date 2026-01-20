package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio04 {
	
	/*Mensajes secretos: Hacer un programa que pida por teclado palabras hasta que se introduzca la palabra “FIN” en mayúsculas, o hasta introducir un máximo de 30. Una vez
	hecho esto, mostrará una palabra formada por la primera letra de cada palabra introducida (excepto la palabra “FIN”, si se hubiera introducido), una detrás de otra en la
	misma línea.
	Ejemplo:
	Palabra 1: Seguimos
	Palabra 2: escribiendo
	Palabra 3: cosas
	Palabra 4: recurrentes
	Palabra 5: en
	Palabra 6: tiempos
	Palabra 7: oscuros
	Palabra 8: FIN
	Palabra secreta: Secreto */
	public static void main (String[] args) {
		String[] a;
		a = new String[30];
		int cont1 = 0;
		boolean parar = false;
		Scanner leer = new Scanner(System.in);
		
		/*Utilizamos un do while para pedir las palabras y guardarlas en un array, y como condiciones para salir de bucle ponemos que se guarde un máximo 
		de 30 palabras y que no se haya escrito "FIN"*/
		do 
		{
			cont1++;
			System.out.println("Dame una palabra (" + cont1 + "/" + a.length + ")");
			a[cont1 - 1] = leer.nextLine();
			if (a[cont1 - 1].equals("FIN"))
			{
				parar = true;
			}
		}
		while (cont1 < 30 && !parar);
		
		//Mostramos la palabra secreta usando un for para pasar por cada palabra escrita guardadas en el array y mostrar solo la primera letra de estas
		System.out.print("Palabra secreta: ");
		for (int cont2 = 0; cont2 < cont1 - 1; cont2++)
		{
			System.out.print(a[cont2].charAt(0));
		}
	}
}