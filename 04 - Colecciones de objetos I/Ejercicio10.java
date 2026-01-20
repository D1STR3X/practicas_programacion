package rios.bermejo.gonzalo;

import java.util.Random;

public class Ejercicio10 {

	/*Hacer un programa que reciba por argumento de entrada dos valores “nTiradas” y “nCaras”, y simule a continuación “nTiradas” de un dado de “nCaras”, mostrando el número el número 
	de veces que ha salido cada una de las caras con respecto al total,	así como el porcentaje que éste representa.*/
	public static void main (String[] args) {
		Random random = new Random();
		
		//Obtenemos el número de tiradas y el número de caras del dado de los dos primeros valores del args de main
		int nTiradas = Integer.parseInt(args[0]);
		int nCaras = Integer.parseInt(args[1]);
		
		//El array de resultados será tan grande como el número de tiradas
		int[] resultados = new int[nTiradas];
		
		//El array de los contadores será tan grande como el número de caras, es decir, la cantidad de números posibles
		double[] contador = new double[nCaras];
		
		//Rellenamos el array de resultados con números random desde el 1 hasta nCaras
		for (int i = 0; i < resultados.length; i++) {
			resultados [i] = random.nextInt(nCaras) + 1; //El número aleatorio empieza desde 0 siempre, en este caso del 0 al 5 (6 valores en total). Ya que 0 no es un número del dado, le sumamos uno al número aleatorio y los nuevos posibles valores van desde el 1 hasta el 6
		}
		
		//Rellenamos el array contador con los contadores de cada resultado 
		for (int j = 0; j < resultados.length; j++) {
			for (int k = 0; k < contador.length; k++) {
				if (resultados[j] == k + 1) {
					contador[k]++;
				}
			}
		}
		
		//Mostramos los resultadosm con sus porcentajes
		for (int x = 0; x < contador.length; x++) {
			System.out.println((x + 1) + ": " + (int)contador[x] + "/" + nTiradas + " (" + (contador[x] / nTiradas * 100) + "%)");
		}
	}
}