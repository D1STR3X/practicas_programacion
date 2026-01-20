package variado;

import java.util.Scanner;

public class API {

	public static int[] fillResultados (int[] resultados, int nC) {
		for (int cont = 0; cont < resultados.length; cont++) {
			resultados [cont] = (int)(Math.random() * nC + 1);
		}
		return resultados;
	}
	
	public static double[] fillContador (int[] resultados, double[] contador) {
		for (int cont1 = 0; cont1 < resultados.length; cont1++) {
			for (int cont2 = 0; cont2 < contador.length; cont2++) {
				if (resultados[cont1] == cont2 + 1) {
					contador[cont2]++;
				}
			}
		}
		return contador;
	}
		
	public static void mostrarContador (double[] contador, int nT) {
		for (int cont = 0; cont < contador.length; cont++) {
			System.out.println((cont + 1) + ": " + (int)contador[cont] + "/" + nT + " (" + (contador[cont] / nT * 100) + "%)");
		}
	}
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int n1 = leer.nextInt();
		System.out.println("Introduce otro número");
		int n2 = leer.nextInt();
		
		int max = Math.max(n1, n2);
		System.out.println("El mayor número de los introducidos es " + max);
		System.out.println();
		
		System.out.println("Introduce el número de tiradas");
		int nT = leer.nextInt();
		int[] resultados = new int[nT];
		
		System.out.println("Introduce el número de caras del dado");
		int nC = leer.nextInt();
		double[] contador = new double[nC];
		
		fillResultados(resultados, nC);
		fillContador(resultados, contador);
		mostrarContador(contador, nT);
	}
}
