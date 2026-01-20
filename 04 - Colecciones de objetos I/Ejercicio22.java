package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio22 {

	public static void mostrar (String[][] BaseD, String requiere) {
		int cont2;
		//Separamos los encambezados a imprimir si se ingresa un * o una de las otras opciones
		if (requiere.equals("*")) {
			System.out.println("DNI	|NOMBRE	|APELLIDO	");
			System.out.println("-------------------------");
		}
		else {
			System.out.println(requiere.toUpperCase());
			System.out.println("--------");
		}
		
		for (int cont1 = 0; cont1 < BaseD.length; cont1++) {
			//Con un switch separamos las acciones a realizar dependiendo de lo que se requiere
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
				case "*":
					for (cont2 = 0; cont2 < BaseD.length; cont2++) {
						System.out.print(BaseD[cont1][cont2] + (cont2 == 2 ? "	" : "	|"));
					}
					System.out.println();
					break;
			}
		}
	}

	public static void main(String[] args) {
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
		
		//Mostramos las opciones
		Scanner leer = new Scanner(System.in);
		System.out.println("¿Qué desea ver?");
		System.out.println("- nombre");
		System.out.println("- apellido");
		System.out.println("- dni");
		System.out.println("- *");
		String requiere = leer.next().toLowerCase();
		
		//Invocamos el método mostrar parar mostrar el array de lo requerido
		mostrar(BaseD, requiere);
	}
}