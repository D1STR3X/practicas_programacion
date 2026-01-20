package rios.bermejo.gonzalo;

public class Ejercicio26 {

	//Mejorar el método anterior para que se etiqueten las columnas del número 1 hasta el 10, y las filas desde la letra “A” hasta la “J”
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
				{" ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"},
				{"A", " ", " ", " ", " ", " ", ".", " ", " ", " ", "."},
				{"B", " ", "O", "O", "X", "O", "O", " ", " ", " ", " "}, // -> Carrier (2,2)-(2,6), Carrier Hit (2,4)
				{"C", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
				{"D", ".", "X", "O", ".", ".", ".", " ", "O", ".", "."}, // -> Destroyer (4,2)-(4,3), Battleship (4,8), Destroyer Hit (4,2)
				{"E", " ", " ", " ", " ", " ", " ", ".", "X", ".", " "}, // -> Battleship Hit (5,8)
				{"F", " ", " ", " ", ".", ".", " ", " ", "O", ".", " "}, // -> Battleship (6,8)
				{"G", ".", " ", "O", "O", "O", " ", " ", "O", " ", " "}, // -> Cruiser (7,3)-(7,5), Battleship (7,8)
				{"H", "X", " ", ".", " ", " ", ".", " ", ".", " ", "."}, // -> Submarine (8,0) Hit (8,0)
				{"I", "O", " ", ".", " ", " ", " ", " ", " ", ".", "."}, // -> Submarine (9,0)
				{"J", "O", " ", " ", " ", " ", " ", ".", " ", " ", "."}  // -> Submarine (10,0)
		};
		
		//Invocamos el método mostrar para mostrar el array t
		mostrar(t);
	}
}