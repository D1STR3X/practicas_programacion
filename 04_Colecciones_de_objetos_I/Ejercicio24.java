package rios.bermejo.gonzalo;

public class Ejercicio24 {

	/*Crear un array “t” de tipo String[][] de 10x10 casillas “hard-coded” que contenga cualquier combinación de los caracteres “O”, “.” y “X”
	o el espacio “ ”. Intentar que dicha distribución sea coherente con el aspecto de un tablero del juego “Hundir la flota” en el que
	- el punto “.” representa al agua,
	- el “O” representa una parte de un barco
	- la cruz “X” representa una parte de un barco dañada
	- el espacio “ “ representaría una casilla con contenido desconocido*/
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
	}
}
