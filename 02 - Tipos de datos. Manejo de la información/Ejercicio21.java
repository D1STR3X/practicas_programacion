package rios.bermejo.gonzalo;

import java.util.Scanner;

public class Ejercicio21 {

	//Dado un número de segundos, mostrar el desglose en días, horas, minutos y segundos
	public static void main(String[]args) {
		System.out.println("Dame un número de segundos"); 
		Scanner leer = new Scanner(System.in); //Utilizamos la clase Scanner importada del java.util package
		int segundosTotales = leer.nextInt();
		
		int segundosEnUnDía = 24 * 60 * 60;
		int segundosEnUnaHora = 60 * 60;
		int segundosEnUnMinuto = 60;
		
		int días = (int) segundosTotales / segundosEnUnDía; //Calculamos el número de días que podemos formar con los segundos
		int segundosRestantes1 = segundosTotales % segundosEnUnDía; //Calculamos cuantos segundos nos quedan para las siguientes operaciones
		
		int horas = segundosRestantes1 / segundosEnUnaHora; //Calculamos el número de horas que podemos formar con los segundos restantes de la operación anterior
		int segundosRestantes2 = segundosTotales % segundosEnUnaHora; //Calculamos una vez más cuantos segundos nos quedan para la siguiente operación
		
		int minutos = segundosRestantes2 / segundosEnUnMinuto; //Calculamos el número de minutos que poder formar con los segundos restantes de la operación anterior
		int segundos = segundosTotales % segundosEnUnMinuto; //Ahora nos quedamos con los segundos restantes
		
		System.out.println(días + "d " + horas + "h " + minutos + "m " + segundos + "s");
	}
}
