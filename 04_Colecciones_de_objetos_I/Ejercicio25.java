package rios.bermejo.gonzalo;

public class Ejercicio25 {

	//Crear un método mostrar(t: String[][]) que muestre el contenido del array “t” por pantalla
	public static void mostrar (String[][] t) {
		//Mostramos el array
		for (int cont1 = 0; cont1 < t.length; cont1++) {
			for (int cont2 = 0; cont2 < t.length; cont2++) {
				System.out.print(t[cont1][cont2] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		//"Hard-coded" un array t
		String[][] t = {
				{" ", " ", " ", " ", " ", ".", " ", " ", " ", "."},
				{" ", "O", "O", "X", "O", "O", " ", " ", " ", " "}, // -> Carrier (2,2)-(2,6), Carrier Hit (2,4)
				{" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
				{".", "X", "O", ".", ".", ".", " ", "O", ".", "."}, // -> Destroyer (4,2)-(4,3), Battleship (4,8), Destroyer Hit (4,2)
				{" ", " ", " ", " ", " ", " ", ".", "X", ".", " "}, // -> Battleship Hit (5,8)
				{" ", " ", " ", ".", ".", " ", " ", "O", ".", " "}, // -> Battleship (6,8)
				{".", " ", "O", "O", "O", " ", " ", "O", " ", " "}, // -> Cruiser (7,3)-(7,5), Battleship (7,8)
				{"X", " ", ".", " ", " ", ".", " ", ".", " ", "."}, // -> Submarine (8,0) Hit (8,0)
				{"O", " ", ".", " ", " ", " ", " ", " ", ".", "."}, // -> Submarine (9,0)
				{"O", " ", " ", " ", " ", " ", ".", " ", " ", "."}  // -> Submarine (10,0)
		};
		
		//Invocamos el método mostrar para mostrar el array t
		mostrar(t);
	}

}
