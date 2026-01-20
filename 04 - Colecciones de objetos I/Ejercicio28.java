package rios.bermejo.gonzalo;

public class Ejercicio28 {

	/*Crear un método initDescubierto (): String[][] que cree un tablero de barcos enemigos descubiertos “vacío” del juego de los barcos,
	es decir que en todas sus 10x10 casillas esté contenido un espacio “ ” */
	public static void initDescubierto (String[][] t) {
		//Rellenamos el array con " "
		for (int cont1 = 0; cont1 < t.length; cont1++) {
			for (int cont2 = 0; cont2 < t.length; cont2++) {
				t[cont1][cont2] = " ";
			}
		}
	}

	public static void main(String[] args) {
		String[][] t = new String [10][10];
		initDescubierto(t);
		
		//Para demostrar que el array se rellenó correctamente (selecciona todo el terminal para ver el bloque)
		for (int cont1 = 0; cont1 < t.length; cont1++) {
			for (int cont2 = 0; cont2 < t.length; cont2++) {
				System.out.print(t[cont1][cont2] + " ");
			}
			System.out.println();
		}
	}
}