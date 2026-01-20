package main;

import ej3.CestaCompra;
import ej3.Limon;

public class Prog3 {

	public static void main(String[] args) {
		CestaCompra prueba = new CestaCompra();
		prueba.comerFruta();
		System.out.println();
		
		prueba.n.comer();
		prueba.l.comer();
		//Los atributos privados no son accesibles fuera de su clase. Ahora no funcionan
	}
}
