package rios.bermejo.gonzalo;

public class Ejercicio29 {

	/*Crear un método ubicar(t: String[][], fila:String, columna: String, hv: String, tam:int):int
	que ubique en el tablero propio “t” un barco de tamaño “tam” (entre 2 y 4 casillas) en las coordenadas “fila” e “columna” 
	(dadas en términos del tablero, por ejemplo “B”, “3”) y “hv” indica si el barco se debe extender en horizontal hacia la derecha 
	(si su valor es “H”) o en vertical hacia abajo, si su valor es “V”.	El método devolverá:
	- 0 si el posicionamiento ha sido correcto.
	- -1 si el barco se sale de los límites del tablero, además no se ubicará
	- -2 si el barco queda adyacente en cualquiera de sus casillas a otro barco, además no se ubicará
	- -3 cualquier otro error */ 
	public static int ubicar(String[][] t, String fila, String columna, String hv, int tam) {
		int ubicar = 0;
		int filaNum = 0;
		int pruebaC;
		int pruebaF;
		int coordPF;
		int coordPC;
		int contF;
		int contC;
		
		//Con un switch case comprobamos que los datos de fila y columna sean válidos
		switch (columna) {
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
			case "10":
				//Con el segundo switch convertimos las letras de la fila en números
				switch (fila) {
					case "A": 
						filaNum = 1;
						break;
					case "B":
						filaNum = 2;
						break;
					case "C":
						filaNum = 3;
						break;
					case "D":
						filaNum = 4;
						break;
					case "E":
						filaNum = 5;
						break;
					case "F":
						filaNum = 6;
						break;
					case "G":
						filaNum = 7;
						break;
					case "H":
						filaNum = 8;
						break;
					case "I":
						filaNum = 9;
						break;
					case "J": 
						filaNum = 10;
						break;
					default:
						ubicar = -3;
				}
				break;
			default:
				ubicar = -3;
		}
		
		//Con dos ifs comprobamos si la orientación ingresada es válida
		if (hv.equals("V") && ubicar == 0) {
			if (filaNum + tam - 1 <= t.length) {
				for (contF = filaNum; contF < filaNum + tam; contF++) {	
					if (t[contF][Integer.parseInt(columna)].equals(" ")) {
						for (pruebaF = -1; pruebaF <= 1; pruebaF++) {
							for (pruebaC = -1; pruebaC <= 1; pruebaC++) {
								coordPF = contF + pruebaF;
								coordPC = Integer.parseInt(columna) + pruebaC;
								if (t[coordPF][coordPC] != " ") {
									ubicar = -2;
								}
							}
						}
					}
					else {
						ubicar = -2;
					}
				}
				if (ubicar != -2) {
					for (contF = filaNum; contF < filaNum + tam; contF++) {
						t[contF][Integer.parseInt(columna)] = "O";
					}
				}
			}
			else {
				ubicar = -1;
			}
		}
		else {
			if (hv.equals("H") && ubicar == 0) {
				if (Integer.parseInt(columna) + tam - 1 <= t.length) {
					for (contC = Integer.parseInt(columna); contC < Integer.parseInt(columna) + tam; contC++) {	
						if (t[filaNum][contC].equals(" ")) {
							for (pruebaF = -1; pruebaF <= 1; pruebaF++) {
								for (pruebaC = -1; pruebaC <= 1; pruebaC++) {
									coordPF = filaNum + pruebaF;
									coordPC = contC + pruebaC;
									if (t[coordPF][coordPC] == "O") {
										ubicar = -2;
									}
								}
							}
						}
					}
					if (ubicar != -2) {
						for (contC = Integer.parseInt(columna); contC < Integer.parseInt(columna) + tam; contC++) {
							t[filaNum][contC] = "O";
						}
					}
				}
				else {
					ubicar = -1;
				}
			}
			else {
				ubicar = -3;
			}
		}
		return ubicar;
	}

	public static void main(String[] args) {
		int tam = 4;
		String fila = "D";
		String columna = "5";
		String hv = "V";
		
		//"Hard-coded" un array t
		String[][] t = {
				{" ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"},
				{"A", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
				{"B", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
				{"C", " ", " ", " ", " ", " ", " ", " ", "O", " ", " "},
				{"D", " ", " ", " ", " ", " ", " ", " ", "O", " ", " "},
				{"E", " ", " ", " ", " ", " ", " ", " ", "O", " ", " "},
				{"F", " ", " ", " ", " ", " ", " ", " ", "O", " ", " "},
				{"G", " ", " ", "O", "O", "O", " ", " ", " ", " ", " "},
				{"H", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
				{"I", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
				{"J", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "}
		};
		
		//Mostramos el resultado de nuestro intento de ubicar un barco
		System.out.println(ubicar(t, fila, columna, hv, tam));
		System.out.println();
		
		//Mostramos el array t para ver donde, si es que se ubicó, el barco
		for (int cont1 = 0; cont1 < t.length; cont1++) {
			for (int cont2 = 0; cont2 < t.length; cont2++) {
				System.out.print(t[cont1][cont2] + " ");
			}
			System.out.println();
		}
	}

}
