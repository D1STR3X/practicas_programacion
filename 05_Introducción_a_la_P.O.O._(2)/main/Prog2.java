package main;

import java.util.Random;
import ej2.A;

public class Prog2 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int nRand = random.nextInt(100) + 1;
		
		System.out.println("Número aleatorio: " + nRand);
		
		for (int cont = 0; cont < nRand; cont++) {
			new A();
		}
		
		System.out.println("Número de objetos creados según el contador de A: " + A.numeroDeObjetos());
		
		if (A.numeroDeObjetos() == nRand) {
			System.out.println("El programa ha funcionado");
		}
		else {
			System.out.println("Eh... algo ha salido mal");
		}
	}

}
