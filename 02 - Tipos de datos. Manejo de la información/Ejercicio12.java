package rios.bermejo.gonzalo;

public class Ejercicio12 {

	/*Hacer un método llamado “doble” que reciba un número entero y devuelva el doble de dicho número entero. Invocar a doble desde main, para calcular y mostrar el doble de
	los números 2,3 y 5*/
	public static int doble (int número) { //Método doble que recibe un número entero y devuelve su doble
		int resultado = 2 * número;
		return resultado;
	}
	public static void main (String[]args) {
		int resultado;
		resultado = doble(2);	//Invocamos el método doble desde main
		System.out.println(resultado); 
		resultado = doble(3);	//Invocamos el método doble desde main una vez más
		System.out.println(resultado);
		resultado = doble(5);	//Volvemos a invocar el método doble desde main
		System.out.println(resultado);
	}
}
