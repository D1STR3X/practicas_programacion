package main;

import figuras.*;
import java.util.Random;

public class prog1 {

	public static void main(String[] args) {

		figura[] figuras = new figura[10];
		Random r = new Random();

		for (int i = 0; i < figuras.length; i++) {
			if (r.nextBoolean()) {
				double base = r.nextDouble() * 10;
				base = (double)Math.round(base * 100.0) / 100.0;
				double altura = r.nextDouble() * 10;
				altura = (double)Math.round(altura * 100.0) / 100.0;
				figuras[i] = new triangulo(base, altura);
			}
			else {
				double radio = r.nextDouble() * 10;
				radio = (double)Math.round(radio * 100.0) / 100.0;
				figuras[i] = new circulo(radio);
			}
		}

		for (figura f : figuras) {
			System.out.println(f);

			if (f instanceof triangulo) {
				triangulo t = (triangulo) f;
				System.out.print("Área: ");
				t.area();
			}
			
			System.out.println();
		}
	}
}