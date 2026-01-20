package rios.bermejo.gonzalo;

public class Ejercicio14 {

	//Crear un método maximo, que reciba dos números tipo int y devuelva el mayor de ambos
	public static int maximo (int n1, int n2) { //Método maximo que recibe dos números enteros y devuelve el mayor
		int max = (n1 > n2) ? n1 : n2; //Utilizamos un operador ternario para identificar el número mayor
		return max;
	}
	public static void main (String[]args){
		int max = maximo (6, 2); //Invocamos el método maximo desde main
		System.out.println(max);
	}
}
