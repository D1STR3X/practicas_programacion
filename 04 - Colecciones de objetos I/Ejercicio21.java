package rios.bermejo.gonzalo;

public class Ejercicio21 {

	/*Rehacer de nuevo el ejercicio de forma que muestre el contenido de todas las filas, pero asumir que en la primera de las filas 
	están los nombres de las columnas (en mayúsculas). Dibujar un separador entre el nombre de las columnas y el contenido de las filas.*/
	public static void mostrar (String[][] BaseD) {
		System.out.println("DNI	|NOMBRE	|APELLIDO	");
		System.out.println("-------------------------");
		
		//Mostramos el array
		for (int cont1 = 0; cont1 < BaseD.length; cont1++) {
			for (int cont2 = 0; cont2 < BaseD.length; cont2++) {
				System.out.print(BaseD[cont1][cont2] + (cont2 == 2 ? "	" : "	|"));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int tamaño = Integer.parseInt(args[0]);
		String[][] BaseD = new String[tamaño][tamaño];
		int cont1;
		int cont2;
		
		//Rellenamos el array con los valores del args de main
		for (cont1 = 0; cont1 < BaseD.length; cont1++) {
			for (cont2 = 0; cont2 < BaseD.length; cont2++) {
				BaseD[cont1][cont2] = args[1 + cont1 * tamaño + cont2];
			}
		}
		
		//Invocamos el método mostrar para mostrar el array
		mostrar(BaseD);
	}
}