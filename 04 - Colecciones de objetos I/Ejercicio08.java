package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio08 {

	/*Hacer una programa Calculadora que funcione de la siguiente manera “java Calculadora <operacion> <op1> <op2>”. 
	Funcionará para las operaciones “suma” “resta” “mul” y “div” y operandos decimales*/
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		//Muestro de forma visualmente placentera lo que pido (dos números a operar) y las operaciones que se pueden realizar
		System.out.println("CALCULADORA JAVA");
		System.out.print("Ingresa el primer número a operar: ");
		double n1 = leer.nextInt();
		System.out.print("Ingresa el segundo número a operar: ");
		double n2 = leer.nextInt();
		leer.nextLine();
		System.out.println("Elija la operación a realizar:");
		System.out.println("- Suma (suma)");
		System.out.println("- Resta (resta)");
		System.out.println("- Multiplicación (mul)");
		System.out.println("- División (div)");
		System.out.print("Operación: ");
		String opSelect = leer.nextLine().toLowerCase();
		
		//Con un switch determino que hacer en cada operacion, incluyendo si me introducen una opción inválida
		switch (opSelect) {
			case "suma": 
				System.out.println("Se ha seleccionado: Suma");
				System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
				break;
			case "resta": 
				System.out.println("Se ha seleccionado: Resta");
				System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
				break;
			case "mul": 
				System.out.println("Se ha seleccionado: Multiplicación");
				System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
				break;
			case "div": 
				if (n2 != 0) 
				{
					System.out.println("Se ha seleccionado: División");
					System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
				}
				else 
				{
					System.out.println("Error: No se puede dividir entre 0");
				}
				break;
			default: 
				System.out.println("Operación inválida");
		}
	}
}