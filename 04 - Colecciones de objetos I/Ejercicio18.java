package rios.bermejo.gonzalo;

public class Ejercicio18 {

	/*Crear una pseudo base de datos utilizando arrays, que guarde la información de las siguientes personas: 
	Listarlas con el siguiente formato:
	<Apellido>, <Nombre> (<DNI>)
	<Apellido>, <Nombre> (<DNI>) ...*/
	public static void main(String[] args) {
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
		
		//Mostramos el array
		for (cont1 = 0; cont1 < BaseD.length; cont1++) {
			for (cont2 = 0; cont2 < BaseD.length; cont2++) {
				System.out.print(cont2 == 2 ? "(" + BaseD[cont1][cont2] + ")" : BaseD[cont1][cont2] + " ");
			}
			System.out.println();
		}
	}

}