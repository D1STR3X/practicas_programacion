package rios.bermejo.gonzalo;

public class Ejercicio27 {

	/*Crear un método init (): String[][] que cree un tablero propio “vacío”, del juego de los barcos, es decir que en todas sus
	10x10 casillas esté contenido el carácter punto “.”*/
	public static void init (String[][] t) {
		//Rellenamos el array con .
		for (int cont1 = 0; cont1 < t.length; cont1++) {
			for (int cont2 = 0; cont2 < t.length; cont2++) {
				t[cont1][cont2] = ".";
			}
		}
	}

	public static void main(String[] args) {
		String[][] t = new String [10][10];
		init(t);
		
		//Para demostrar que el array se rellenó correctamente
		for (int cont1 = 0; cont1 < t.length; cont1++) {
			for (int cont2 = 0; cont2 < t.length; cont2++) {
				System.out.print(t[cont1][cont2] + " ");
			}
			System.out.println();
		}
	}
}