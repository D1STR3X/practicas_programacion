package rios.bermejo.gonzalo;

public class Ejercicio19 {

	//Listar sólo los nombres
	public static void main(String[] args) {
		//El primer valor del args de main es el tamaño del array
		int tamaño = Integer.parseInt(args[0]);
		String[][] BaseD = new String[tamaño][tamaño];
		int cont1;
		int cont2;
		
		//Con un for llenamos el array con los valores del args de main
		for (cont1 = BaseD.length - 1; cont1 >= 0; cont1--) {
			for (cont2 = BaseD.length - 1; cont2 >= 0; cont2--) {
				BaseD[cont1][cont2] = args[(1 + cont1) * tamaño - cont2];
			}
		}
		
		//Asignamos el valor 1 al cont2 para mostrar solo los nombres
		cont2 = 1;
		for (cont1 = 0; cont1 < BaseD.length; cont1++) {
			System.out.println(BaseD[cont1][cont2]);
		}
	}
}