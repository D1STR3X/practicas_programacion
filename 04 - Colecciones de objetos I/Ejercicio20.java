package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio20 {


	public static void mostrar (String[][] BaseD, String requiere) {
		int cont2;
		
		//Utilizamos un switch para separar las acciones de acuerdo a lo que nos piden mostrar
		for (int cont1 = 0; cont1 < BaseD.length; cont1++) {
			switch (requiere) {
				case "dni": 
					cont2 = 0;
					System.out.println(BaseD[cont1][cont2]);
					break;
				case "nombre":
					cont2 = 1;
					System.out.println(BaseD[cont1][cont2]);
					break;
				case "apellido":
					cont2 = 2;
					System.out.println(BaseD[cont1][cont2]);
					break;	
				case "todo":
					for (cont2 = 0; cont2 < BaseD.length; cont2++) {
						System.out.print(BaseD[cont1][cont2] + " ");
					}
					System.out.println();
					break;
			}
		}
	}

	public static void main(String[] args) {
		//El primer valor del args de main es el tamaño del array
		int tamaño = Integer.parseInt(args[0]);
		String[][] BaseD = new String[tamaño][tamaño];
		int cont1;
		int cont2;
		
		//Rellenamos el array con los valores del args de main
		for (cont1 = 0; cont1 < BaseD.length; cont1++) {
			for (cont2 = 0; cont2 < BaseD.length; cont2++) {
				BaseD[cont1][cont2] = args[1 + cont1 * tamaño + cont2];
			}
		}
		
		//Mostramos las opciones de lo que se puede mostrar
		Scanner leer = new Scanner(System.in);
		System.out.println("¿Qué desea ver?");
		System.out.println("- nombre");
		System.out.println("- apellido");
		System.out.println("- dni");
		System.out.println("- todo");
		String requiere = leer.next().toLowerCase();
		
		//Mostramos el array de lo pedido
		mostrar(BaseD, requiere);
	}
}